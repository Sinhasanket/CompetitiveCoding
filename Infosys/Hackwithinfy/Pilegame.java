package Infosys.Hackwithinfy;

import java.util.Scanner;

public class Pilegame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            long n = sc.nextLong();
            if (n%2==0){
                System.out.println("A");
            }else {
                System.out.println("B");
            }
        }
    }
}
