package Infosys.InfyTq;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinimumConsecutiveNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int mat[][] = new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        ArrayList<Integer> set = new ArrayList<>();
        for (int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
               if (j<m-3){
                   if (checkElement(mat[i][j],mat[i][j+1],mat[i][j+2],mat[i][j+3])){
                       set.add(mat[i][j]);
                   }
               }
               if (i<n-3){
                   if (checkElement(mat[i][j],mat[i+1][j],mat[i+2][j],mat[i+3][j])){
                       set.add(mat[i][j]);
                   }
               }
               if (j<m-3 && i>=3){
                   if (checkElement(mat[i][j],mat[i-1][j+1],mat[i-2][j+2],mat[i-3][j+3])){
                       set.add(mat[i][j]);
                   }
               }
               if (j>=3 && i >= 3){
                   if (checkElement(mat[i][j],mat[i-1][j-1],mat[i-2][j-2],mat[i-3][j-3])){
                       set.add(mat[i][j]);
                   }
               }

            }
        }
        if(set.size()==0) System.out.println("-1");
        else System.out.println(Collections.min(set));
    }

    public static boolean checkElement(int x,int y,int z,int a){
        return (x==y && y==z && z==a);
    }
}

//5 6
//1 3 3 3 3 9
//1 6 9 2 3 9
//1 2 2 5 4 9
//2 2 4 5 7 9
//2 4 5 6 7 2
