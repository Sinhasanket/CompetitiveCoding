package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Binxor {

    public static long saveTheFactors[]=new long[100008];

    public static void main(String[] args){
        try{

            FastReader fast = new FastReader();

            saveTheFactors[0] = 1;

            for(int i=1;i<=100001;i++) saveTheFactors[i] = ((saveTheFactors[i-1]%1000000007)*(i%1000000007))%1000000007;

            int TestCase = fast.nextInt();

            while(TestCase-->0){

                int length = fast.nextInt();

                String firstString = fast.next();
                String secondString = fast.next();
                ArrayList<Long> arr = new ArrayList<>();

                long countAzeroes=0;
                long countAOne=0;
                long countBZero=0;
                long countBOne=0;

                for(int i=0;i<length;i++){
                    if(firstString.charAt(i)=='1') countAOne++;
                    else countAzeroes++;

                    if(secondString.charAt(i)=='1')countBOne++;
                    else countBZero++;
                }

                long Maximum=0;
//                System.out.println(countAzeroes+" "+countAOne);
//                System.out.println(countBZero+" "+countBZero);
                if(countAzeroes <= countBOne) Maximum += countAzeroes;
                else if(countAzeroes > countBOne) Maximum += countBOne;

                if(countBZero <= countAOne)	Maximum += countBZero;
                else if(countBZero > countAOne)	Maximum += countAOne;

                long Minimum=0;

                if(countAzeroes <= countBZero) Minimum += countAzeroes;
                else if(countBZero < countAzeroes) Minimum += countBZero;

                if(countAOne <= countBOne)	Minimum += countAOne;
                else if(countAOne > countBOne)	Minimum += countBOne;

                Minimum = length - Minimum;

                long temp = Maximum;
                
                while(temp != Minimum){
                    arr.add(temp);temp = temp - 2;
                }
//                System.out.println(temp);
                arr.add(temp);
                long Answer=0;

                for(int i=0;i<arr.size();i++){
                    Answer += fermatLittle(length,arr.get(i),1000000007);
                    Answer %= 1000000007;
                }
//                System.out.println(Answer);
                StringBuffer sb = new StringBuffer();
                sb.append(Answer);
                System.out.println(sb);
            }
        }catch (Exception e){
            return;
        }
    }


    static long  fastExpo(long x,long y,long p){
        long  res = 1;
        x = x % p;
        while (y > 0) {
            if ((y & 1)==0)
                res = (res*x) % p;
            y = y>>1;
            x = (x*x) % p;
        }
        return res;
    }

    static long modInverse(long  n, long  p) {
        return fastExpo(n, p-2, p);
    }


    static long fermatLittle(long  n,long  r,long  p) {

        if (r==0)
            return 1;
        return (saveTheFactors[(int)n]* modInverse(saveTheFactors[(int)r], p) % p *
                modInverse(saveTheFactors[(int)(n-r)], p) % p) % p;
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