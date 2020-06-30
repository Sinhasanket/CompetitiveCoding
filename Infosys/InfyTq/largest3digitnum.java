package Infosys.InfyTq;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

//Combination of Longest 3 digit pair return total combination and largest number out of it

public class largest3digitnum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] ip = str.split(",");
        String inp ="";
        for (int i=0;i<ip.length;i++){
            inp+=ip[i];
        }
        HashSet<Integer> ans = new HashSet<>();
        solve(inp,"",ans);
        ArrayList<Integer> list = new ArrayList<>(ans);
        Collections.sort(list);
        System.out.println(list.get(list.size()-1)+","+ans.size());
    }
    public static void solve(String str, String ans, HashSet<Integer> li){
        if (str.length()==0){
            String insert = ans.substring(0,3);
            li.add(Integer.parseInt(insert));
            return;
        }
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String ros = str.substring(0,i)+str.substring(i+1);
            solve(ros,ans+ch,li);
        }
    }
}

//1,2,1
//211,3