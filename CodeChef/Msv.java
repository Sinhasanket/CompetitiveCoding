package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;
public class Msv{
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main (String[] args) throws java.lang.Exception {
        FastReader scn=new FastReader();
        long testcases=scn.nextLong();
        StringBuilder sb=new StringBuilder();
        while(testcases-->0) {
            String a=scn.next();
            String b=scn.next();
            BigInteger d=new BigInteger(a);
            BigInteger e=new BigInteger(b);
            long counter=0;
            BigInteger f=new BigInteger("0");
            BigInteger g=new BigInteger("0");

            BigInteger B=new BigInteger("0");
            while((e.compareTo(BigInteger.valueOf(0)) == 1)){
                f=d.xor(e);
                g=d.and(e);
                d=f;
                BigInteger changedvalue = g.shiftLeft(1);
                e=changedvalue;
                counter++;
            }
            sb.append(counter+"\n");
        }
        System.out.println(sb);

    }
}