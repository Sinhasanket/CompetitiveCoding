package Infosys.Hackwithinfy;

import java.util.Arrays;
import java.util.Scanner;

public class Solve2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String str = sc.next();
            int count=0;
            String ans = "";
            for (int i=0;i<n;i++){
                for (int j=i+1;j<n;j++){
                    if (str.charAt(j) < str.charAt(i)){
                        ans+=str.charAt(i)+""+str.charAt(j);
                        count+=2;
                        i = j;
                    }
                }
                if (count>=k){
                    break;
                }
            }
            char an[]=ans.toCharArray();
            Arrays.sort(an);
            if (count>=k){
                System.out.println("Yes");
                for (int i=0;i<k;i++){
                    System.out.print(an[i]);
                }
            }else {
                System.out.println("No");
            }
        }
    }
}