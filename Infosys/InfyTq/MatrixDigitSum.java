package Infosys.InfyTq;

import java.util.Scanner;

public class MatrixDigitSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m =sc.nextInt();
        int mat[][] = new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        Boolean flag = true;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<m-1;j++){
               int a = getDigitSum(mat[i][j]);
               int b = getDigitSum(mat[i][j+1]);
               int c = getDigitSum(mat[i+1][j]);
               int d = getDigitSum(mat[i+1][j+1]);
               if (a==0 || b==0 || c==0 || d==0)continue;
               if ( mat[i][j]%a ==0 && mat[i][j+1]%b==0 && mat[i+1][j]%c==0 && mat[i+1][j+1]%d==0){
                   System.out.println(mat[i][j]+" "+mat[i][j+1]);
                   System.out.println(mat[i+1][j]+" "+mat[i+1][j+1]);
                   flag = false;
               }
            }
        }
        if (flag) System.out.println("-1");
    }

    public static int getDigitSum(int num){
        int ans = 0;
        while (num != 0){
            ans+=(num%10);
            num/=10;
        }
        return ans;
    }
}

//INPUT
//        4 3
//        42 54 2
//        30 24 27
//        180 190 40
//        11 121 13
//OUTPUT
//        42 54
//        30 24
//        54 2
//        24 27
//        30 24
//        180 190
//        24 27
//        190 40
