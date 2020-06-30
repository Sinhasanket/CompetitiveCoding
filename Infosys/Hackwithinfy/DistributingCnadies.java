package Infosys.Hackwithinfy;

import java.util.Arrays;
import java.util.Scanner;

public class DistributingCnadies {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            int ans[]=new int[n];
            Arrays.fill(ans,1);
            for(int i=1;i<n;i++){
                if(arr[i] > arr[i-1]){
                    ans[i]= ans[i-1]+1;
                }
            }
            for(int i=n-2;i>=0;i--){
                if(arr[i] > arr[i+1] && ans[i] <= ans[i+1]){
                    ans[i]=ans[i+1]+1;
                }
            }
            int print=0;
            for(int i=0;i<n;i++)print+=ans[i];
            System.out.println(print);
        }
    }
}