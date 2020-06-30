package Infosys.Hackwithinfy;

import java.util.Scanner;

public class Thesaurus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            String st = sc.next();
            int index = -1;

            for(int i=0;i<st.length();i++){
                if(st.charAt(i)=='?'){
                    index = i;
                    break;
                }
            }

            if (index==-1){
                System.out.println("0");
            }else if (index==0 || index == st.length()-1){
                System.out.println("1");
            }else {
                char left = st.charAt(index-1);
                char right = st.charAt(index+1);
                if (left==right){
                    System.out.println("25");
                }else {
                    System.out.println("24");
                }
            }
        }
    }
}
