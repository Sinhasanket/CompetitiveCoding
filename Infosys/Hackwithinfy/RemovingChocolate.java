package Infosys.Hackwithinfy;

import java.util.Scanner;

public class RemovingChocolate {
    static int mod = 1000000007;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(ways(n));
    }
    public static long ways(long n){
       int dp[]=new int[(int)n+1];
       dp[1] = 1;
       dp[2] = 1;
       dp[3] = 2;
       for (int i=4;i<=(int)n;i++){
           dp[i] = dp[i-1]%mod+dp[i-3]%mod;
       }
       return dp[(int)n]%mod;
    }
}
