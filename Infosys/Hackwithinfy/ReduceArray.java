package Infosys.Hackwithinfy;

import java.util.Scanner;

public class ReduceArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int arr[]=new int[t];
        for (int i=0;i<t;i++) arr[i]=sc.nextInt();

        int i = 0,j=arr.length-1;
        int sum = 0;
        int count=0;
        while (i<j){
            sum = arr[i]+arr[j];
            if (2*arr[i] >= arr[j] && arr[i] != -1){
                arr[i] = sum;
                arr[j] = -1;
                j--;
                count++;
            }else if(2*arr[j] >= arr[i] && arr[j] != -1){
                arr[j] = sum;
                arr[i] = -1;
                i++;
                count++;
            }else continue;
        }
        System.out.println(count);

    }
}
