package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AprilCovid {
    public static void main(String[] args){
        FastReader fast = new FastReader();
        for (int testcase=fast.nextInt();testcase>0;testcase--){
            int length = fast.nextInt();
            int[] queue = new int[length];
            ArrayList<Integer> queueIndices = new ArrayList<>();
            for (int i=0;i<length;i++){
                queue[i]=fast.nextInt();
                if (queue[i]==1){
                    queueIndices.add(i+1);
                }
            }
            int prev = queueIndices.get(0);
            boolean flag = true;
            for (int i=1;i<queueIndices.size();i++){
                if (queueIndices.get(i) - prev < 6){
                    flag = false;
                    break;
                }
                prev = queueIndices.get(i);
            }

            if (flag) System.out.println("YES");
            else System.out.println("NO");
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
