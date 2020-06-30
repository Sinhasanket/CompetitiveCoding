package Infosys.Hackwithinfy;

import java.util.Scanner;

public class Meeting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int start[] = new int[n];
        int end[] = new int[n];
        for (int i=0;i<n;i++)start[i]=sc.nextInt();
        for (int i=0;i<n;i++)end[i]=sc.nextInt();
        boolean flag = true;
        for (int i = 0;i<n-1;i+=2){
            if(Math.max(start[i],start[i+1]) >= Math.min(end[i],end[i+1])){

            }
        }
        System.out.println((flag) ? 1 : 0 );

    }

}
