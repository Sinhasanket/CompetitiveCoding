package Infosys.InfyTq;

import java.util.Scanner;

public class LongestCommonSustring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st1 = sc.next();
        String st2 = sc.next();
        PrintStringlcs(st1,st2);
    }

    static void PrintStringlcs(String X, String Y) {
        int m = X.length();
        int n = Y.length();
        int[][] L = new int[m+1][n+1];

        for (int i=0; i<=m; i++) {
            for (int j=0; j<=n; j++) {
                if (i == 0 || j == 0)
                    L[i][j] = 0;
                else if (X.charAt(i-1) == Y.charAt(j-1))
                    L[i][j] = L[i-1][j-1] + 1;
                else
                    L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
            }
        }

        if (L[m-1][n-1]==0){
            System.out.println("X");
            return;
        }

        int index = L[m][n];
        int temp = index;

        char[] lcs = new char[index+1];
        lcs[index] = ' ';
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (X.charAt(i-1) == Y.charAt(j-1)) {
                lcs[index-1] = X.charAt(i-1);
                i--;
                j--;
                index--;
            }
            else if (L[i-1][j] > L[i][j-1])
                i--;
            else
                j--;
        }

        for(int k=0;k<=temp;k++)
            System.out.print(lcs[k]);
    }
}

//S1="staobplk" S2="tsodpq"
//Out = ‘top’

//zebra
//lycdk
//X