package Infosys.Hackwithinfy;

import java.util.Scanner;

public class Solvehack {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
           int n = sc.nextInt();
           int arr[]=new int[n];
           for (int i=0;i<n;i++) arr[i]=sc.nextInt();
            System.out.println(solve(arr,n));
        }
    }

   public static int solve(int arr[], int n) {
        int ans = 0;
        for (int i = 1; i < n - 1; ++i) {
            int maximum = 0, maxxi2 = 0;

            for (int j = 0; j < i; ++j)
                if (arr[j] < arr[i])
                    maximum = Math.max(maximum, arr[j]);

            for (int j = i + 1; j < n; ++j)
                if (arr[j] > arr[i])
                    maxxi2 = Math.max(maxxi2, arr[j]);

            ans = Math.max(ans, maximum + (arr[i] * maxxi2));
        }
        return ans;
    }
}