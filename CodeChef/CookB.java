package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CookB {
    int mod = 1000000007;
    public static void main(String[] args) throws IOException{
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long arr[]=new long[n];
            for (int i=0;i<n;i++)arr[i]=sc.nextLong();
            long dp[]=new long[n+1];
            dp[0] = 1;
            long sum = dp[0];
            for (int i=1;i<n;i++){
                if (arr[i] >= arr[i-1]){
                    dp[i] = dp[i-1]+1;
                }else if (arr[i] < arr[i-1]){
                    dp[i] = 1;
                }
                sum+=dp[i];
            }
           // for (int i=0;i<n;i++)System.out.print(dp[i]+" ");
            System.out.println(sum);
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
