package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class IARCSJUD {
    public static void main(String[] args){
        try{
            FastReader in = new FastReader();
            int n = in.nextInt();
            HashSet<String> hs = new HashSet<>();
            for(int i=0;i<n;i++){
                String st = in.nextLine().toLowerCase();
                String p = "";
             //   System.out.println(st);
                for(int z=0;z<st.length();z++){
                    if(st.charAt(z) != '.' && st.charAt(z) != ','  && st.charAt(z) != ':' && st.charAt(z) != ';' && st.charAt(z) != '\''){
                        p += st.charAt(z);
                    }
                     if(st.charAt(z)==' '){
                     //   p+=' ';
                         System.out.println(p);
                        hs.add(p);
                        p = " ";

                    }
                }
              //  System.out.println(p);


            }
            List<String> lis = new ArrayList<>(hs);
            Collections.sort(lis);
            System.out.println(lis);
        }catch (Exception e){
            return;
        }
    }

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

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
