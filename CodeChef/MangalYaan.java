package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MangalYaan {

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

    public static void main(String[] args){
        FastReader in = new FastReader();
        try{

            int t = in.nextInt();
            while(t-->0){
                int num = in.nextInt();
                int astro = in.nextInt();
                int fitness[] = new int[num];
                int count=0;
                for(int i=0;i<num;i++){
                    fitness[i]=in.nextInt();
                    if(fitness[i] >= astro){
                        count++;
                    }
                }
                System.out.println(count);
            }

        }catch (Exception e){
            return;
        }
    }
}
