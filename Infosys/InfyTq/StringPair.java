package Infosys.InfyTq;

import java.util.Scanner;

//find the pair of string whose distinc character is present in other string but not neccesary vice verse
//return -1 if no pair found

public class StringPair {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.replaceAll(","," ");
        String arr[] = str.split(" ");
        int count=0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (i != j){
//                    System.out.println(arr[i]+" "+arr[j]);
                    if(check(arr[i],arr[j]))count++;
                }
            }
        }
        if (count==0) System.out.println("-1");
        else System.out.println(count);
    }
    public static boolean check(String s1,String s2){
        for (int i=0;i<s2.length();i++){
            if (!s1.contains(String.valueOf(s2.charAt(i))))return false;
        }
        return true;
    }
}

//tiger,iger,sunflower,sun,street,ball
//2

//house,player,distinct,rank
//-1
