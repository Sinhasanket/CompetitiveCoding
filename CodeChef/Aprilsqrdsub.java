package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Aprilsqrdsub {
    public static void main(String[] args){
        FastReader inp = new FastReader();
       // int t = inp.nextInt();
       // while (t-->0){
//            int n = inp.nextInt();
           // int arr[]=new int[n];
           // for (int i=0;i<n;i++)arr[i]=inp.nextInt();
           primeFactors(5);
        System.out.println(8*8 - 4);
      //  }
    }

    public static void primeFactors(int n) {
        while (n%2==0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i+= 2) {
            while (n%i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        if (n > 2)
            System.out.print(n);
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
