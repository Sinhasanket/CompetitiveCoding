package Infosys.Hackwithinfy;

import java.util.Scanner;

public class Gameofstring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            String one = sc.next();
            String two = sc.next();
            int move = sc.nextInt();
            if (solve(one.toCharArray(),two.toCharArray(),move)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
//            char[] fir = one.toCharArray();
//            char[] sec = two.toCharArray();
//            HashMap<Integer,Integer> map = new HashMap();
//            map.clear();
//            for (int i=0;i<one.length();i++){
//                int displace=0;
//                if (fir[i] != sec[i]){
//                    if (fir[i]=='z'){
//                        fir[i] = 'a';
//                        displace+=1;
//                        displace = (sec[i]-'a') - (fir[i]-'a')+1;
//                    }else {
//                        displace = (sec[i]-'a') - (fir[i]-'a');
//                    }
//                   // System.out.println(i+" "+displace);
//                    if (!map.containsKey(displace)){
//                        map.put(displace,i);
//                      //  System.out.println(displace);
//                    }else {
//                        int rot = 26 - (fir[i]-'a');
//                        displace = rot +  ((sec[i]-'a')- ('a'-'a'));
//                        if (map.containsKey(displace)){
//                            displace+=displace;
//                            map.put((displace)-1,i);
//                           // System.out.println(displace+displace-1);
//                        }else {
//                            map.put(displace,i);
//                           // System.out.println(displace);
//                        }
//                    }
//                }
//            }
//            boolean flag=true;
//            for (Map.Entry ii : map.entrySet()){
//                int key = (int) ii.getKey();
//                if (key > move){
//                    System.out.println("No");
//                    flag = false;
//                    break;
//                }
//            }
//
//            if (flag) System.out.println("Yes");
        }
    }

    public static boolean solve(char[] s,char[] t,int k){
        int n = s.length;
        for (int i=0;i<n;i++){
            int diff =(t[i]-'a')-(s[i]-'a'); //Character.getNumericValue(t[i]) - Character.getNumericValue(s[i]);
            if (diff < 0){
                diff+=26;
            }
            if (s[i] != t[i] && diff <= k){
//                Character.getNumericValue(s[i])+diff
                if ((s[i]='a')+diff> 122){
                    s[i] = (char)((s[i]-'a')+diff-26);  //(char)(Character.getNumericValue(s[i])+diff-26);
                }else {
                    s[i] =(char)((s[i]-'a')+diff);  //(char)(Character.getNumericValue(s[i])+diff);
                }
            }
        }
        String ss = new String(s);
        String tt = new String(t);
        System.out.println(ss+" "+tt);
        if (ss.equals(tt))return true;
        else return false;
    }
}
