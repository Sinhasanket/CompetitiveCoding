package Codechef;

import java.util.Scanner;

public class Liftme {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int q = sc.nextInt();
            int travel = 0;
            int ff=0;
            while(q-->0){
                int a = sc.nextInt();
                int b = sc.nextInt();
                travel += Math.abs(a-ff);
                travel += Math.abs(b-a);
                ff = b;
            }
            System.out.println(travel);
        }
    }
}