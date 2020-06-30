package Infosys.InfyTq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class nearestpallindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        System.out.println(solve(t));
    }
    public static String solve(int n){
        while (true){
            n++;
            String num = String.valueOf(n);
            StringBuilder r= new StringBuilder(num).reverse();
            String rev = r.toString();
            if (rev.equals(num)){
                return rev;
            }

        }
    }
}
