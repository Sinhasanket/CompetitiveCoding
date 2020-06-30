package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AprilUnitgcd {
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

    public static void main(String[] args){
        FastReader fast = new FastReader();
        int t = fast.nextInt();
        StringBuffer sb = new StringBuffer();
        while(t-->0){
            int n = fast.nextInt();
            if (n<3){
               if (n==1){
                   sb.append(1).append("\n");
                   sb.append(1).append(" ").append(1).append("\n");
               }else{
                   sb.append(1).append("\n");
                   sb.append(2).append(" ").append(1).append(" ").append(2).append("\n");
               }
            }else if (n==3){
                sb.append(1).append("\n");
                sb.append("3").append(" ").append("1").append(" ").append("2").append(" ").append("3").append("\n");
            }else {
                sb.append((n/2)).append("\n");
                sb.append("3").append(" ").append("1").append(" ").append("2").append(" ").append("3").append("\n");
                int two = 2;
                for (int i=4;i<=n;i+=2) {
                    if (i<n){
                        sb.append(two).append(" ").append(i).append(" ").append((i+1)).append("\n");
                    }else {
                        sb.append("1").append(" ").append(i).append("\n");
                    }
                }
            }
        }
        System.out.println(sb);
    }
}
