package Infosys.InfyTq;

import java.util.Scanner;

public class BuildString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String st = sc.next();
            for (int i=0;i<st.length()-1;i++){
                for (int j=i+1;j<st.length();j++){
                    System.out.println(st.substring(i,j));
                }
            }
        }
    }
}
