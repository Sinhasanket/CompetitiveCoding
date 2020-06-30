package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Marm {
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
    }

    public static void main(String[] args){
        try{
            FastReader fr = new FastReader();
            int Test = fr.nextInt();
            while(Test-->0){
                long n = fr.nextInt();
                long k = fr.nextLong();
                long array[] = new long[(int)n];
                StringBuffer sb = new StringBuffer();
                for (int i=0;i<n;i++) array[i] = fr.nextLong();

                long changeK = k%(n*3);
                if((n&1)==1 && k>n/2){
                    long w = n/2;
                    array[(int)w] = 0;
                }

                for (int i =0;i<changeK;i++){
                    array[(int)(i%n)] ^= array[(int)(n-(i%n)-1)];
                }

                for (int i=0;i<n;i++) sb.append(array[i]).append(" ");

                System.out.println(sb);
            }
        }catch (Exception e){
            return;
        }
    }
}