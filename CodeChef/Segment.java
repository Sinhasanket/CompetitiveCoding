package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Segment {
    public static void main(String[] args){
        FastReader f = new FastReader();
        int t = f.nextInt();

        while(t-->0){
            int n = f.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=f.nextInt();
            }

            int q = f.nextInt();

            while(q-->0){
                int l = f.nextInt()-1;
                int r=f.nextInt()-1;
                int ans =  arr[l] & arr[r];
              //  System.out.println(ans);
                if (ans==0 )  System.out.println("EVEN");
                else  System.out.println("ODD");
            }

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
