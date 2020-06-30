package Infosys.Hackwithinfy;

import java.util.Scanner;

public class Countandsay {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        System.out.println(solve(t));
    }
    public static String solve(int n){
        String res = "1";
        while (n>1){
            StringBuilder curr = new StringBuilder();
            int i = 0;
            while (i<res.length()){
                int count=1;
                while (i+1<res.length() && res.charAt(i)==res.charAt(i+1)){
                    count++;i++;
                }
                curr.append(count).append(res.charAt(i));
                i++;
            }
            res=curr.toString();
            n--;
        }
        return res;
    }
}
