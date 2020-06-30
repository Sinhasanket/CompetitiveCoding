package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Circular {
    public static void main(String[] args) throws IOException{
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int arr[]=new int[n];
            int cnt=0;
            ArrayList<Integer> li = new ArrayList<>();
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]==1){
                    cnt++;
                    li.add(i);
                }
            }
            if (cnt==0) System.out.println("0");
            else {

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
