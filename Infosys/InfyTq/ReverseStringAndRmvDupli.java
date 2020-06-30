package Infosys.InfyTq;

import java.util.*;

public class ReverseStringAndRmvDupli {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        HashSet<Character> dupli = new LinkedHashSet<>();
        for (int i=0;i<str.length();i++){
            dupli.add(str.charAt(i));
        }
        String ans="";
        for (Character ch : dupli)ans+=ch;
        StringBuilder rev = new StringBuilder(ans).reverse();
        ans = rev.toString();
        System.out.println(ans);
    }
}

//google
//elog