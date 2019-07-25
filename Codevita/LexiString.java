package Codevita;

import java.io.*;
import java.util.StringTokenizer;

public class LexiString {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    public static void main(String a[]){

        try{
            FastReader sc = new FastReader();
            int test = sc.nextInt();
            while(test-->0){
                String P = sc.next();
                String S = sc.next();
                solve(P,S);
            }
        }catch (Exception e){
            return;
        }
    }

    public static void solve(String p,String s){
        int len = s.length();
        char pchar[] = p.toCharArray();
        char schar[] = s.toCharArray();
        char ch[] = new char[len];
        int z=0;
        for(int i=0;i<p.length();i++){
            for(int j=0;j<s.length();j++){
                if(pchar[i]==schar[j]){
                    ch[z] = pchar[i];
                    z++;
                }
            }
        }
        String ans = new String(ch);
        StringBuffer sb = new StringBuffer();
        sb.append(ans);
        System.out.println(ans);
    }
}

//input
//2
//polikujmnhytgbvfredcxswqaz
//abcd
//qwryupcsfoghjkldezxvbintma
//ativedoc

//output
//bdca
//codevita