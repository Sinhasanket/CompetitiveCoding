package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Saktan {

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

    }
        public static void main (String[] args){
            try {
                FastReader in = new FastReader();
                int T = in.nextInt();
                while(T-->0) {
                 int Row = in.nextInt();
                 int Column = in.nextInt();
                 int Query = in.nextInt();

                 int R[] = new int[Row];
                 int C[] = new int[Column];

                 while(Query-->0) {
                   int x = in.nextInt();
                   int y = in.nextInt();
                   R[x-1]++;C[y-1]++;
                 }

                 long oddRow=0,evenRow=0,oddCol=0,evenCol=0;

                 for (int i=0;i<Row;i++)  if (R[i]%2==0) evenRow++;


                 for (int i=0;i<Row;i++) if (R[i]%2!=0) oddRow++;


                 for (int j=0;j<Column;j++) if (C[j]%2==0) evenCol++;


                 for (int j=0;j<Column;j++) if (C[j]%2!=0) oddCol++;

                 StringBuffer sb = new StringBuffer();
                 long ans = (evenRow*oddCol)+(evenCol*oddRow);
                 sb.append(ans);
                 System.out.println(ans);
                }
            }catch (Exception e) {
                return;
            }
    }
}