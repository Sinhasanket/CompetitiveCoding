package Codevita;

import java.util.Scanner;

//AC

public class BoardGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mat[][] = new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        int dp[][] = new int[n+1][n+1];
        for (int i=1;i<n;i++){
            dp[0][i] =(int) Math.floor(dp[0][i-1] / 2 )+ mat[0][i];
        }
        for (int i=1;i<n;i++){
            dp[i][0] =(int) Math.floor(dp[i-1][0] / 2 )+ mat[i][0];
        }

        for (int i=1;i<n;i++){
            for (int j=1;j<n;j++){
                dp[i][j] = Math.min((int) Math.floor(dp[i-1][j] / 2 )+ mat[i][j],
                        (int) Math.floor(dp[i][j-1] / 2 )+ mat[i][j]);
            }
        }

        System.out.print(dp[n-1][n-1]);
    }
}

//       Input
//
//        5
//
//        0 82 2 6 7
//
//        4 3 1 5 21
//
//        6 4 20 2 8
//
//        6 6 64 1 8
//
//        1 65 1 6 4
//
//        Output
//
//        7


//       Input
//
//        4
//
//        0 3 9 6
//
//        1 4 4 5
//
//        8 2 5 4
//
//        1 8 5 9
//
//        Output
//
//        12