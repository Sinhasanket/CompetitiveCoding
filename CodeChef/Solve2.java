package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve2 {
    public static void main(String[] args){
        try{
            FastReader fast = new FastReader();
            int t = fast.nextInt();
            while (t-->0){
                long len = fast.nextLong();
                long first = fast.nextLong();
                long second = fast.nextLong();
                long ans = (long) Math.pow(2,len-1)*(first+second);
                if (ans%3==0) System.out.println("YES");
                else System.out.println("NO");
            }
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