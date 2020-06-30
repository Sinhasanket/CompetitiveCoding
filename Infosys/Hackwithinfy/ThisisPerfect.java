package Infosys.Hackwithinfy;

import java.util.Scanner;

public class ThisisPerfect {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t-->0){
            long n = sc.nextLong();
            if(n==0 || n==1){
                System.out.println("NO");
                continue;
            }
            long ans = 0;
            for (int i=2;i<=Math.sqrt(n);i++){
                if (n%i==0){
                    if (i==(n/i)){
                        ans+=i;
                    }else {
                        ans+= (i+(n/i));
                    }
                }
            }
            long check = ans+1;
            if (check==n) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
