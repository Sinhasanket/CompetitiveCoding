package Infosys.InfyTq;

import java.util.Scanner;

public class StringRevExceptSpecialChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        String c = "";
        for(int i=0;i<st.length();i++){
            if(Character.isAlphabetic(st.charAt(i)) || Character.isDigit(st.charAt(i))){
                c+=st.charAt(i);
            }
        }
        StringBuilder rev = new StringBuilder(c).reverse();
      //  String check = rev.toString();
        //   System.out.println(check);
        // System.out.println(st);
        int z = 0;
        for(int i=0;i<st.length();i++){
            if(Character.isAlphabetic(st.charAt(i)) || Character.isDigit(st.charAt(i)) ){
                System.out.print(rev.charAt(z));
                z++;
            }else{
                System.out.print(st.charAt(i));
            }
        }
    }
}
