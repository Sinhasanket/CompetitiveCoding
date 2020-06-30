package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SC31 {

    public static void main(String[] args) {
       try{
            FastReader read = new FastReader();
            int t = read.nextInt();
            while(t-->0){
               int n = read.nextInt();
               String[] weapons = new String[n];
               for (int i=0;i<n;i++){
                   weapons[i] = read.nextLine();
               }
               int result = 0;
               for(int i=0;i<n;i++){
                   result ^= Integer.parseInt(weapons[i],2);
               }
                System.out.println(Integer.bitCount(result));
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

//        1
//        3
//        1110001101
//        1010101011
//        0000000011