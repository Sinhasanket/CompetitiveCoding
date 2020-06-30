package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class XYSTR {
    int mod = 1000000007;

    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        StringBuffer ans= new StringBuffer();
        while (t-->0){
            String str = sc.next();
            int i=0,j=str.length()-1;
            int counter = 0;
            while (i<j){
               // System.out.println(str.charAt(i)+" "+str.charAt(i+1));
                if (str.charAt(i) != str.charAt(i+1)){
                    counter++;
                    i++;
                }
                i++;
            }
            ans.append(counter).append("\n");
        }
        System.out.print(ans);
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

