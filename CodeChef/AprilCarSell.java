package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AprilCarSell {
    public static void main(String[] args){
        FastReader fast = new FastReader();
        for (int testcase = fast.nextInt();testcase>0;testcase--){
            int length = fast.nextInt();
            long cars[]=new long[length];
            for (int i=0;i<length;i++)cars[i]=fast.nextLong();
            Arrays.sort(cars);
            long profit=0;
            for (int i=length-1;i>=0;i--){
                //System.out.println(cars[i]);
                if (cars[i]!=0){
                    long val = (cars[i]-(length-1-i));
                   // System.out.println(val+"val");
                    if (val<0){
                        val=0;
                    }
                    profit=(profit+val)%1000000007;
                }

            }
            System.out.println(profit);
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

//        2
//        3
//        6 6 6
//        3
//        0 1 0