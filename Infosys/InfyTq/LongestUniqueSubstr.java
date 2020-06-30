package Infosys.InfyTq;

import java.util.HashMap;
import java.util.Scanner;

//Find longest substring with unique Character caseSensitive

public class LongestUniqueSubstr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int i;
        int n = str.length();
        int st = 0;
        int currlen;
        int maxlen = 0;
        int start=0;//-1
        HashMap<Character,Integer> map = new HashMap<>();
        map.put(str.charAt(0),0);

        for (i = 1; i < n; i++) {
            if (!map.containsKey(str.charAt(i)))
                map.put(str.charAt(i),i);
            else {
                if (map.get(str.charAt(i)) >= st) {
                    currlen = i - st;
                    if (maxlen < currlen) {
                        maxlen = currlen;
                        start = st;
                    }
                    st = map.get(str.charAt(i)) + 1;

                }
                map.put(str.charAt(i),i);
            }
        }

        if (maxlen < i - st) {
            maxlen = i - st;
            start = st;
        }

        System.out.println(map);

        String ans = str.substring(start,maxlen);
       // if (ans.length() < 3) System.out.println("-1");
//        else
            System.out.println(str.substring(start, maxlen));
    }
}

//abcdabc
//abcd

//abababab
//-1

//abAca
//abAc