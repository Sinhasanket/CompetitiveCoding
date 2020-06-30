package Infosys.Hackwithinfy;

import java.util.Scanner;

public class Modulus5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int k =sc.nextInt();
            int ans[]=new int[k+1];
            int z =0;
            for (int i=n;i<=100000;i++){
                if ((z-1)==k)break;
                int num = i;
                int sum ;
                for (sum = 0; num > 0; sum+=(num%10),num=num/10);

                if (sum%5==0){
                    ans[z++] = i;
                }
            }
            System.out.println(ans[k-1]);
        }
    }
}

//5
//6
