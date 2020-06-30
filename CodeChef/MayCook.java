package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MayCook {
    int mod = 1000000007;

    public static void main(String[] args) throws IOException{
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            long arr[]=new long[n];
            for (int i=0;i<n;i++)arr[i]=sc.nextLong();
            for (int i=0;i<n-k;i++){
                if(arr[i] > arr[i+k]){
                    long temp = arr[i];
                    arr[i]=arr[i+k];
                    arr[i+k]=temp;
                }
            }
            boolean flag = true;
            for (int i=0;i<n-1;i++){
                if(arr[i] > arr[i+1]){
                    flag = false;
                    System.out.println("no");
                    break;
                }
            }
            if (flag) System.out.println("yes");
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
