package Infosys.InfyTq;

import java.util.Scanner;

public class OtpGeneration {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String oddPlaces = "";
        String squaring = "";
        for(int i=1;i<str.length();i+=2){
            oddPlaces+=str.charAt(i);
        }
        System.out.println(oddPlaces);
        for (int i=0;i<oddPlaces.length();i++){
            int num = Character.getNumericValue(oddPlaces.charAt(i));
            num = num*num;
            squaring+= num+"";
        }
        System.out.println(squaring.substring(0,4));
    }
}

//I/P
//12345678
//O/P
//4163