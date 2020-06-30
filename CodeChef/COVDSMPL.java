package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//JUST Querying on every cell of the matrics

public class COVDSMPL {
    int mod = 1000000007;
    public static void main(String[] args) throws IOException{
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int p = sc.nextInt();
            int mat[][] = new int[n][n];
            for (int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    System.out.println("1 "+(i+1)+" "+(j+1)+" "+(i+1)+" "+(j+1));
                    System.out.flush();
                    int ans = sc.nextInt();
                    if (ans==1){
                        mat[i][j] = 1;
                    }else {
                        mat[i][j] = 0;
                    }
                }
            }
            System.out.println("2");
            System.out.flush();
            for (int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    System.out.print(mat[i][j]+" ");
                    System.out.flush();
                }
                System.out.println();
                System.out.flush();
            }
            int verdict = sc.nextInt();
            if (verdict==-1){
                break;
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

