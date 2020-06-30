package Codechef;

import java.util.Scanner;

public class Coda {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int k = sc.nextInt();
        while (k-->0 && n!=0){
            long last = n%10;
            if (last==0){
                n = n/10;
            }else {
                n = n-1;
            }
        }
        System.out.println(n);
    }
}
