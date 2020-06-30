package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EOEO {
    static int MOD = 1000000007;

    public static void main(String[] args) throws IOException{
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-->0){
            long TS = sc.nextLong();
            long counter=0;
            if(TS%2==0){
                long cnt = 0;
                long divide = TS;
                while (divide%2==0){
                    divide=divide/2;
                    cnt++;
                }
                long findPower = pow(2,cnt+1,MOD); // (long) Math.pow(2,cnt);
                counter = TS/findPower;
            }else if (TS%2 != 0){
                counter=(TS-1)/2;
            }
            System.out.println(counter);
        }
    }

    static long pow(long x, long y, long p) {
        long res = 1;
        x = x % p;
        if (x == 0) return 0;
        while (y > 0) {
            if((y & 1)==1)
                res = (res * x) % p;
            y = y >> 1;
            x = (x * x) % p;
        }
        return res;
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

