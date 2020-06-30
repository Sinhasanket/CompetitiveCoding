package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Easy {
    int mod = 1000000007;

    public static void main(String[] args) throws IOException{
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        HashSet<Long> lookup = new LinkedHashSet<>();
        HashMap<Long,Long> ranges = new HashMap<>();
        while (t-->0){
            long left = sc.nextLong();
            long right = sc.nextLong();
            ranges.put(left,right);
        }
        long max = Integer.MIN_VALUE;
        for (Map.Entry check : ranges.entrySet()){
            long val = (long) check.getValue();
            if (val > max)max=val;
        }
        sieve(max,lookup);
        ArrayList<Long> cc = new ArrayList<Long>(lookup);
        for (Map.Entry it : ranges.entrySet()){
            long l = (long) it.getKey();
            long r = (long) it.getValue();
            //binary search for left and right elemet and print it

        }

    }


    public static void sieve(long num,HashSet<Long> allPrimes){
        boolean primes[]=new boolean[(int)num+1];
        for (int i=0;i<(int)num;i++){
            primes[i]=true;
        }
        for (int i=2;i*i<=num;i++){
            if (primes[i]==true){
                for (int j=i*2;j<=num;j+=i){
                    primes[j]=false;
                }
            }
        }
        for (int i=2;i<=num;i++){
            if (primes[i]==true){
                allPrimes.add((long)i);
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

        double nextDouble() {
            return Double.parseDouble(next());
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


