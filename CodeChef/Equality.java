package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Equality {
    public static void main(String[] args){
        try{
            Scanner fast = new Scanner(System.in);
            int n = fast.nextInt();
            int q = fast.nextInt();
            long arr[]=new long[n+1];
            for (int i=1;i<=n;i++) arr[i]=fast.nextLong();

            while(q-->0){
                int l = fast.nextInt();
                int r = fast.nextInt();
                if(arr[l]<arr[l+1] != arr[r-1] < arr[r]) System.out.println("YES");
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
