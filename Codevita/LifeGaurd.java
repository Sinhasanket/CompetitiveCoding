package Codevita;

import java.util.Scanner;

public class LifeGaurd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = new String("durga");
        s.concat("soft");
        System.out.println(s);

        StringBuffer sb = new StringBuffer("durga");
        sb.append("soft");
        System.out.println(sb);
    }
}
