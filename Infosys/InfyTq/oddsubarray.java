package Infosys.InfyTq;

import java.util.Scanner;

public class oddsubarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[]=new int[n];
            int countodd=0;
            for(int i=0;i<n;i++){
              arr[i]=sc.nextInt();
              if (arr[i]%2!=0){
                  countodd++;
              }
            }
            for (int i =0;i<n;i++){
                int sum = 0;
                for(int j=i;j<n;j++){
                    sum+=arr[j];
                }
                if (sum%2!=0){
                    countodd++;
                }
            }
            System.out.println(countodd);
        }
    }
}


//1
//3
//1 2 3

//4