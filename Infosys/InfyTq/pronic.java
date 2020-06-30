package Infosys.InfyTq;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

//Given a  input say (12630).find out all the numbers in
//this input which was a multiplication of consecutive numbers.
// It included 2(1*2), 6(2*3), 12(3*4), 30(5*6).

public class pronic {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        String num = String.valueOf(t);
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<100000;i++){
            if(pronic(i)){
                hs.add(i);
            }
        }

        HashSet<Integer> li = new HashSet<>();
        for(int i=0;i<num.length();i++){
            for(int j=i+1;j<=num.length();j++){
                int nn = Integer.parseInt(num.substring(i,j));
                if(hs.contains(nn)){
                    li.add(nn);
                }
            }
        }

        ArrayList<Integer> ans = new ArrayList<>(li);
        Collections.sort(ans);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }

    }

    public static boolean pronic(int x) {
        for (int i = 0;i <= (int)(Math.sqrt(x));i++)
            if (x == i * (i + 1))
                return true;
        return false;
    }
}

//Another Approach
//import java.util.*;
//public class Program
//{
//    public static void main(String[] args) {
//        Scanner sc =new Scanner (System.in);
//        String s=sc.next();
//        int num=Integer.parseInt(s);
//        for(int i=0;i<=num/2;i++)
//        {
//            int a=i;
//            int ans = a*(a+1) ;
//            String str=String.valueOf(ans);
//            if (s.contains(str))
//            {
//                System.out.print(ans+" ");
//            }
//        }
//    }
//}

