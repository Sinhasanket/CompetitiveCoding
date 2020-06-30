package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class adashop {
    public static void main(String[] args){
        FastReader input = new FastReader();
        int Testcase = input.nextInt();
        while(Testcase-->0){
            int row = input.nextInt();
            int col = input.nextInt();
            int m = (row+col)/2;

            if (row==1 && col==1){
                System.out.println("34");
                System.out.print("2 2\n 1 3\n 2 4\n 1 5\n 2 6\n 1 7\n 2 8\n 3 7\n 4 8\n 5 7\n 6 8\n 7 7\n 8 8\n 7 7\n 8 6\n 7 5\n 8 4\n 7 3\n 8 2\n 7 1\n 6 2\n 5 1\n 4" +
                        " 2\n 3 1\n 4 2\n 3 3\n 4 4\n 3 5\n 4 6\n 5 5\n 6 6\n 5 5\n 6 4\n 5 3\n");
            }else {
                System.out.print("36\n");
                System.out.print(+m+"\n"+m+"\n1 1\n2 2\n1 3\n2 4\n1 5\n2 6\n1 7\n2 8\n3 7\n4 8\n5 7\n6 8\n7 7\n8 8\n7 7\n8 6\n7 5\n8 4\n7 3\n8 2\n7 1\n6 2\n5 1\n4 2\n3 " +
                        "1\n4 2\n3 3\n4 4\n3 5\n4 6\n5 5\n6 6\n5 5\n6 4\n5 3\n");

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