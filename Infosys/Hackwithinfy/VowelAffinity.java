package Infosys.Hackwithinfy;

import java.util.Scanner;

public class VowelAffinity {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int freq[]=new int[26];
        for (int i=0;i<str.length();i++){
            freq[str.charAt(i)-'A']++;
        }

        int vowel=0,conso=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='A' || str.charAt(i)=='E'|| str.charAt(i)=='I' ||
                    str.charAt(i)=='O'||
                    str.charAt(i)=='U' ){
                vowel++;
            }else {
                conso++;
            }
        }

        int ans = waycon(conso+1,freq) * wayvow(vowel,freq);
        System.out.println(ans);
    }

    public static int waycon(int sz,int freq[]){
        int ans = fact(sz);
        for (int i=0;i<26;i++){
            if (i==0||i==4||i==8||i==14||i==20)continue;
            else ans = ans/fact(freq[i]);
        }
        return ans;
    }

    public static int wayvow(int sz,int freq[]){
        return fact(sz) / (fact(freq[0]) * fact(freq[4]) * fact(freq[8]) *
                fact(freq[14]) * fact(freq[20]));

    }

    public static int fact(int n){
        int f=1;
        for (int i=2;i<=n;i++){
            f*=i;
        }
        return f;
    }
}
