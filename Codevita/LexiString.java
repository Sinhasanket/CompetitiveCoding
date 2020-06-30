package Codevita;

import java.util.Scanner;

//AC

public class LexiString {
    public static void main(String a[]){
            Scanner sc = new Scanner(System.in);
            int test = sc.nextInt();
            while(test-->0){
                String P = sc.next();
                String S = sc.next();
                solve(P,S);
                System.out.println();
            }
    }

    public static void solve(String p,String s){
        char newa[] = p.toCharArray();
        int slen = s.length();
        int count[] = new int[26];
        for (int i=0;i<slen;i++){
            char ch = s.charAt(i);
            count[ch-97]++;
        }
        for (int i=0;i<26;i++){
            char ch = newa[i];
            int asc = (int)ch;
            if (count[asc-97]!=0){
                for (int x=1;x<=count[asc-97];x++){
                    System.out.print(ch);
                }
            }
        }
    }
}


//input
//2
//polikujmnhytgbvfredcxswqaz
//abcd
//qwryupcsfoghjkldezxvbintma
//ativedoc

//output
//bdca
//codevita