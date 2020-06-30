package Infosys.InfyTq;

import java.util.Scanner;

public class PrefixSuffix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int len = st.length();
        int half = len/2;
        if (len<2){
            System.out.println("-1");
            System.exit(0);
        }
        for (int i=half;i>=0;i--){
            String pre = st.substring(0,i);
            String suff = st.substring(len-i,len);
            if (pre.equals("") || suff.equals("")){
                System.out.println("-1");
                break;
            }
            if (pre.equals(suff)){
                System.out.println(pre.length());
                break;
            }
        }
    }
}

//abcdabc
//3
//ababa
//1
//abcde
//-1