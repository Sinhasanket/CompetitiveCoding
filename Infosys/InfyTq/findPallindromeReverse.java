package Infosys.InfyTq;

import java.util.Scanner;

public class findPallindromeReverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (true){
            //convert it to string
            String original = String.valueOf(num);
            //reverse it
            StringBuilder b = new StringBuilder(original).reverse();
            String rv = b.toString();
            //add both
            int reversed = Integer.parseInt(rv);
            num = num + reversed;
            //now reverse the sum
            String check = String.valueOf(num);
            StringBuilder sb = new StringBuilder(check).reverse();
            String check1 = sb.toString();
            //check if sum and reversed num is same
            if (check.equals(check1)){
                System.out.println(check1);
                break;
            }
        }
    }
}
