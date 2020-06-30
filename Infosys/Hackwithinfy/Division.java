package Infosys.Hackwithinfy;

import java.util.Scanner;

public class Division {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long rem = c%a;
            if(b>=a){
                System.out.println("-1");
                continue;
            }
            if(rem==b){
                System.out.println(c);
                continue;
            }
            if (rem > b){
                System.out.println(c-(rem-b));
                continue;
            }else{
                System.out.println((c-rem)-a+b);
            }
        }
    }
}

//2
//3 2 9
//1 2 4