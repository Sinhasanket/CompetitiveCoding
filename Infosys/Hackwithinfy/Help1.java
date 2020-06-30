package Infosys.Hackwithinfy;

import java.util.ArrayList;
import java.util.Scanner;

public class Help1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> li = new ArrayList<>();
        int number;
        int ans = 0;
        String len = "";
        for (int i=0;i<n;i++){
            len+="l";
        }
        int l = len.length();
        for (int j = 0; j < 2; j++) {
            int i = 1;
            while ((number = createPalindrome(i, 10, j % 2)) < 10000) {
                if ((int)Math.log10(number)+1 == l  && number%9==0){
                    String c = String.valueOf(number);
                    int index = -1;
                    index = c.indexOf('0');
                    if (index==-1){
                        ans += (number)%1000000007;
                    }
                }
                i++;
            }
        }
        System.out.println(ans);
    }

    static int createPalindrome(int input, int b, int isOdd) {
        int n = input;
        int palin = input;
        if (isOdd == 1)
            n /= b;
        while (n > 0) {
            palin = palin * b + (n % b);
            n /= b;
        }
        return palin;
    }
}