package Codechef;

import java.util.Scanner;

public class Contest {
    public static void main(String args[]) {
        Scanner f = new Scanner(System.in);
        int t = f.nextInt();
        while(t-->0) {
            int n = f.nextInt();
            int k = f.nextInt();
            long a1[] = new long[n];
            long sum=0;
            for (int i = 0; i < n; i++){
                a1[i] = f.nextLong();
                sum+=a1[i];
            }
            System.out.println(sum%k);
        }
    }
}
