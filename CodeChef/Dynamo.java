package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dynamo {
    public static void main(String[] args){
        try{
            FastReader fast = new FastReader();
            for (int TestCase=fast.nextInt();TestCase>0;TestCase--){
                long N = fast.nextLong();
                long a = fast.nextLong();
                long num=0;
                while(N-->0){
                    num = num*10;
                    num = num+9;
                   // System.out.println(num);
                }

                long S = 2*num+2+a;

                System.out.println(S);
                System.out.flush();

                long b = fast.nextLong();

                System.out.println(num-b+1);
                System.out.flush();

                long d = fast.nextLong();

                System.out.println(num-d+1);
                System.out.flush();

                int finalCheck = fast.nextInt();

                if (finalCheck==-1) break;

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
    }
}
