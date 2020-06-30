package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Plmu {

    public static void main(String[] args) {
        try{
            FastReader fast = new FastReader();
            int TestCase = fast.nextInt();
            while(TestCase-->0){
                int LengthOfSubsequence = fast.nextInt();
                long zeroCount = 0;
                long twoCount = 0;
                for (int i=0;i<LengthOfSubsequence;i++){
                    long check = fast.nextLong();
                    if(check==0){
                        zeroCount++;
                    }else if (check==2){
                        twoCount++;
                    }
                }
                long Ans = ((zeroCount*(zeroCount-1))/2 + (twoCount*(twoCount-1))/2);
                StringBuffer sb = new StringBuffer();
                sb.append(Ans);
                System.out.println(sb);
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