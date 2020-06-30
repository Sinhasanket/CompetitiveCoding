package Google;

import java.util.Arrays;
import java.util.Scanner;

public class KickA1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int z = 1;
        while(t-->0){

            int st = sc.nextInt();
            int ele = sc.nextInt();
            int plates = sc.nextInt();
            int mat[][]=new int[st][ele];

            for (int i=0;i<st;i++){
                for (int j=0;j<ele;j++){
                    mat[i][j] = sc.nextInt();
                }
            }

            int dp[][]=new int[st+1][ele+1];
            for (int i[] : dp){
                Arrays.fill(i,-1);
            }

            int total = recur(0,plates,ele,st,dp,mat);

            System.out.println("Case #"+z+": "+total);
            z++;
        }
    }

    public static int recur(int index,int rem,int k,int n,int [][]dp,int [][]grid){
        if(index==n&&rem==0)return 0;
        if(index==n)return Integer.MIN_VALUE;
        if(rem==0)return 0;
        int standard = rem;
      //  System.out.println(dp[index][rem]);
        if(dp[index][rem]!=-1)return dp[index][rem];
        int max = recur(index+1,rem,k,n,dp,grid);
        int sum = 0;

        for(int i=0;i<k;i++){
            if(rem==0)break;
            sum+=grid[index][i];
            max = Math.max(max,sum+recur(index+1,rem-1,k,n,dp,grid));
            rem -=1;
        }
        dp[index][standard] = max;
        return max;
    }
}
