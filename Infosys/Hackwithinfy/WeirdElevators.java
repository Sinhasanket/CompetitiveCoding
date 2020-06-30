package Infosys.Hackwithinfy;

import java.util.ArrayList;
import java.util.Scanner;

public class WeirdElevators {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer> hs = new ArrayList<>();
        while (t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int m = sc.nextInt();
            int floor = gcd(x,y);
            int a = x/floor;
            int b = y/floor;
            int x_distance = primeFactors(a,hs,m);
            hs.clear();
            int y_ditance = primeFactors(b,hs,m);
            hs.clear();
            if (x_distance==-1 || y_ditance==-1) System.out.println("-1");
            else System.out.println((x_distance+y_ditance)+" "+floor);
        }
    }

    public static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }

    public static int primeFactors(int n,ArrayList<Integer> pf,int m){
        while (n%2==0){
             pf.add(2);
            n/=2;
        }
        for (int i=3;i<=Math.sqrt(n);i+=2){
            while (n%i==0){
                if (i>=m) return -1;
                else pf.add(i);
                n/=i;
            }
        }
        if (n>=m)return -1;
        else if (n>2) pf.add(n);

        return pf.size();
    }
}
