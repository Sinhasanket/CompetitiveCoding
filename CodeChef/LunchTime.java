package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class LunchTime {
    public static void main(String[] args){
        try{
            FastReader read = new FastReader();
            int t = read.nextInt();
            while(t-->0){
               long a = read.nextLong();
               long m = read.nextLong();

                ArrayList<Long> factorss = new ArrayList<>();
                ArrayList<Long> Answer = new ArrayList<>();
                factorss.clear();Answer.clear();

                factors(m,factorss);
                long count=0;
                for (Long ii : factorss){
                    if ((ii-1)%a==0){
                        long k =(ii-1)/a;
                        long d = m/ii;
                        if (k*d != 0)
                          Answer.add(k*d);
                        count++;
                    }
                }
                Collections.sort(Answer);
                System.out.println(count-1);
                StringBuffer sb = new StringBuffer();
                for (int i=0;i<Answer.size();i++) sb.append(Answer.get(i)).append(" ");
                System.out.println(sb);

            }
        }catch (Exception e){
            return;
        }
    }

    public static ArrayList<Long> factors(long num, ArrayList<Long> al){
        for (long i=1;i*i<=num;i++){
            if(num%i==0){
                al.add(i);
            }
        }
        return al;
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