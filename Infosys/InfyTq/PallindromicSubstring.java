package Infosys.InfyTq;

//Given a Number find out the longest pallindromic substring without leading zero if
// there is no possible number return -1

import java.util.ArrayList;
import java.util.Scanner;

public class PallindromicSubstring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> all = new ArrayList<>();
        int i=0;
        int maxSize = Integer.MIN_VALUE;
        while (i<str.length()){
            char firstChar = str.charAt(i);
            if (str.charAt(i) != 0) {
                int  j = i+1;
                while (j < str.length()) {
                    char secondChar = str.charAt(j);
                    if (firstChar==secondChar){
                        String get = str.substring(i,j+1);
                        StringBuilder rv = new StringBuilder(get).reverse();
                        String check = rv.toString();
                        if (get.equals(check)){
                            all.add(get);
                            if (get.length() >= maxSize)maxSize=get.length();
                        }
                    }
                    j++;
                }
            }
            i++;
        }

        if (all.size()==0){
            System.out.println("-1");
            System.exit(0);
        }

       for (String pallindrome : all){
           if (pallindrome.length()==maxSize) System.out.println(pallindrome);
       }
    }
}

//Example:-
//30696965456

//69696
//65456

//12345
//-1