package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class xorengine {
    public static void main(String[] args){
        try {
            FastReader in = new FastReader();
            StringBuffer sb = new StringBuffer();
            int t = in.nextInt();
            while (t-- > 0) {
                int n = in.nextInt();
                int q = in.nextInt();
                int arr[] = new int[n];
                int even = 0;
                int odd = 0;
                for (int i = 0; i < n; i++) {
                    arr[i] = in.nextInt();
                    if (Integer.bitCount(arr[i]) % 2 == 0) even++;
                    else odd++;
                }
                while (q-->0) {
                    int qr = in.nextInt();
                    int check = Integer.bitCount(qr);
                    if (check % 2 != 0){
                        sb.append(odd).append(" ").append(even).append("\n");
                    }else{
                        sb.append(even).append(" ").append(odd).append("\n");
                    }

                }
            }
            System.out.println(sb);
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

//1
//6 5
//4 2 15 9 8 8
//3
//4
//7
//9
//6