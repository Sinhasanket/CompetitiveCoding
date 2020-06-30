package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LSTBTF {

    public static void main(String[] args){
        try{
            FastReader read = new FastReader();
            int t = read.nextInt();
            StringBuffer sb = new StringBuffer();
            while(t-->0){
                int n =  read.nextInt();
                int m = read.nextInt();
                long firstSum = 0;
                long secondSum = 0;
                for (int i=0;i<n;i++){
                    firstSum = addition(firstSum,read.nextLong());
                }
                for (int i=0;i<m;i++){
                    secondSum = addition(secondSum,read.nextLong());
                }

                int q = read.nextInt();
                while (q-->0){
                    int option = read.nextInt();
                    if(option==3){
                        long ans = multiply(firstSum,secondSum);
                        if (ans < 0) ans+=998244353;
                        System.out.println(ans);
                    }else if(option==1){
                       // System.out.println("enter");
                          long l = read.nextLong();
                          long r = read.nextLong();
                          long x = read.nextLong();
                          firstSum = addition(firstSum, multiply(r-l+1,  x));
                    }else{
                        long l = read.nextLong();
                        long r = read.nextLong();
                        long x = read.nextLong();
                       secondSum = addition(secondSum, multiply(r-l+1,x));
                    }
                }
            }
        }catch (Exception e){
            return;
        }
    }

    public static long multiply(long a,long b){
        return (a%998244353*b%998244353)%998244353;
    }

    public static long addition(long a,long b){
        return (a%998244353+b%998244353)%998244353;
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
