package Infosys.Hackwithinfy;

import java.util.Scanner;

public class BitCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++)arr[i]=sc.nextInt();
        System.out.println(count(arr,n));
    }

    public static int count(int arr[],int n){
        int count=0;
        for (int i=0;i<32;i++){
            if(fun(i,arr) >= count){
                count = fun(i,arr);
            }
        }
        return count;
    }

    public static boolean isKth(int n,int k){
        if ((n>>(k-1) &1) == 1)return true;
        else return false;
    }

    public static int fun(int x,int arr[]){
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (isKth(arr[i],x))count++;
        }
        return count;
    }
}
