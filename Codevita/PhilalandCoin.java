package Codevita;
//AC

import java.util.Scanner;

public class PhilalandCoin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int ans = (int)(Math.log(n)/Math.log(2));
            System.out.println(ans+1);

        }
    }
}

