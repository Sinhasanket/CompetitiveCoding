package Infosys.InfyTq;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class allpossibilityofstring {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        HashSet<Character> check = new LinkedHashSet<>();
        for (int i = 1; i <= st.length(); i++) {
            solve(st.toCharArray(), "", st.length(), i, check);
        }
    }

    static void solve(char[] arr, String previous, int n, int k, HashSet<Character> put) {
        if (k == 0) {
            for (int i=0;i<previous.length();i++){
                put.add(previous.charAt(i));
            }
            if (put.size() != previous.length()){
                put.clear();
                return;
            }
            System.out.println(previous);
            put.clear();
            return;
        }
        for (int i = 0; i < n; ++i) {
            String newPrefix = previous + arr[i];
            solve(arr, newPrefix, n, k - 1, put);
        }
    }
}

//abc

//a
//b
//c
//ab
//ac
//ba
//bc
//ca
//cb
//abc
//acb
//bac
//bca
//cab
//cba