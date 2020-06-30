package Infosys.Hackwithinfy;

import java.util.Scanner;

//NOT SURE

public class PrimeNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for (int t = sc.nextInt();t>0;t--){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int count=0;
            for (int i = l;i<=r;i++){
                if (isPrime(i))count++;
            }
            System.out.println(count);
        }
    }
//    public static void primeFactors(int n) {
//        while (n%2==0) {
//            System.out.print(2 + " ");
//            n /= 2;
//        }
//
//        for (int i = 3; i <= Math.sqrt(n); i+= 2) {
//            while (n%i == 0) {
//                System.out.print(i + " ");
//                n /= i;
//            }
//        }
//
//        if (n > 2)
//            System.out.print(n+" ");
//    }

    public static boolean isPrime(int num){
        if (num==1)return false;
        for (int i=2;i<=Math.sqrt(num);i++){
            if (num%i==0)return false;
        }
        return true;
    }
}
