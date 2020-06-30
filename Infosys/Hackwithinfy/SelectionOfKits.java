package Infosys.Hackwithinfy;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionOfKits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[]=new long[n];
        long sum = 0;
        for (int i=0;i<n;i++){
            arr[i]=sc.nextLong();
            sum+=arr[i];
        }
        Arrays.sort(arr);
        int j = n-1;
        long bob =arr[j];
        sum-=bob;
        while (sum>=bob){
            j--;
            bob+=arr[j];
            sum-=arr[j];
        }
        System.out.println(n-j);
    }
}
