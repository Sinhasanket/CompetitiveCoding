package Infosys.Hackwithinfy;

import java.util.Scanner;

public class Maximumproduct {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long mat[][]=new long[(int)n][(int)m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                mat[i][j]=sc.nextLong();
            }
        }
        long max = Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            long prod= 1;
            for (int j=0;j<m;j++){
                prod = ((prod%1000000007)*(mat[i][j]%1000000007));
            }
            max = Math.max(prod,max);
        }
        System.out.println(max%1000000007);

    }
}
