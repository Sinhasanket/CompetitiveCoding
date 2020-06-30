package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AprilStrangeNum {
    static int count=0;
    public static void main(String[] args){
        FastReader fast = new FastReader();
        for (int testcase=fast.nextInt();testcase>0;testcase--){
            long X = fast.nextLong();
            long K = fast.nextLong();
            primeFactors(X);
            if (count >= K) System.out.println("1");
            else System.out.println("0");
            count=0;
        }
    }

    public static void primeFactors(long n) {
        while (n % 2 == 0) {
            count++;
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                count++;
                n /= i;
            }
        }
        if (n > 2)
            count++;
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