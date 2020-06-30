package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ZombieAndCave {

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

    public static void main(String[] args) throws java.lang.Exception {
        try {
            FastReader input = new FastReader();
            int testCase = input.nextInt();
            while (testCase-- > 0) {
                int numOfCaves = input.nextInt();
                long[] radiation = new long[numOfCaves];
                long[] zombieHealth = new long[numOfCaves];

                long sum=0;
                int k = 1;
                for (int i = 0; i < numOfCaves; i++) {
                    radiation[i] = input.nextLong();

                    long lowerValue = (k - radiation[i])-1;
                    long highValue = (k + radiation[i]);
                    k++;
                    if (highValue > numOfCaves) {
                        highValue = numOfCaves;
                    }
                    if (lowerValue < 0) {
                        lowerValue = 0;
                    }
                    sum+=(highValue-lowerValue);
                }

                for (int i = 0; i < numOfCaves; i++) {
                    zombieHealth[i] = input.nextLong();
                    sum -= zombieHealth[i];
                }

                System.out.println(sum);
                if(sum==0){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        } catch (Exception e) {
            return;
        }
    }
}
//1 2 3 4 5
//0 0 0 0 0
//1 1 0 0 0
//2 2 1 1 0
//3 3 2 2 1
//4 4 3 3 2
//5 5 4 4 3
