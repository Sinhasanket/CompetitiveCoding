package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chandf {
    int mod = 1000000007;

    public static void main(String[] args) throws IOException{
        FastReader sc = new FastReader();
        int Test = sc.nextInt();
        StringBuilder finalAns = new StringBuilder();
        while(Test-->0){
            long x = sc.nextLong();
            long y = sc.nextLong();
            long l = sc.nextLong();
            long r = sc.nextLong();
            long result =0;
            long ans = 0;
            for (long i=l;i<=r;i++){
                long c = (x&i)*(y&i);
                System.out.println(c);
                if (c > result){
                    result = c;
                    ans = i;
                }
            }
            finalAns.append(ans).append("\n");
        }
        System.out.print(finalAns);
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
