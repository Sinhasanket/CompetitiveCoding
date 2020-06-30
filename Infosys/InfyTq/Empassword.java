package Infosys.InfyTq;

import java.util.Scanner;

public class Empassword {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String removeComma[] = str.split(",");
        String ans = "";

        for (int i=0;i<removeComma.length;i++){
            String getOne[] = removeComma[i].split(":");
            int len = getOne[0].length();
            boolean flag = true;
            int index = -1;
            for (int z=0;z<getOne[1].length();z++){
                if (Character.getNumericValue(getOne[1].charAt(z)) <= len &&
                        Character.getNumericValue(getOne[1].charAt(z)) > index){
                    System.out.println(getOne[1].charAt(z));
                    index = Character.getNumericValue(getOne[1].charAt(z));
                    flag = false;
                }
            }
            if (flag) ans+="X";
            else ans += getOne[0].charAt(index-1);
        }
        System.out.println(ans);
    }
}

//Abhishek:34848,Mayur:4739,Friends:2949,Yeah:9889
//KueX