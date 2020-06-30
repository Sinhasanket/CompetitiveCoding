package Infosys.InfyTq;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortUpperAndLowerCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<Character> lower = new ArrayList<>();
        ArrayList<Character> upper = new ArrayList<>();
        for (int i=0;i<str.length();i++){
            if (Character.isUpperCase(str.charAt(i)))upper.add(str.charAt(i));
            else lower.add(str.charAt(i));
        }
        Collections.sort(lower);Collections.sort(upper);
        String ans = "";
        int i=0,j=0;
        if (upper.size() > lower.size()){
            while (i<upper.size() && j<lower.size()){
                ans+=upper.get(i);
                ans+=lower.get(j);
                i++;j++;
            }
            while (i<upper.size()){
                ans+=upper.get(i);
                i++;
            }
            System.out.println(ans);
        }else {
            while (i<upper.size() && j<lower.size()){
                ans+=upper.get(i);
                ans+=lower.get(j);
                i++;j++;
            }
            while (j<lower.size()){
                ans+=lower.get(j);
                j++;
            }
            System.out.println(ans);
        }
    }
}
//    TraDItIoN
//OP
//    DaIoIrNtT

//SEcuRITY
//op
//EcIuRSTY
