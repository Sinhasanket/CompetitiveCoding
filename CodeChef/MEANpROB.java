package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MEANpROB {
    static class FastReader {

        public static void main(String[] args){
            try{
                FastReader fast = new FastReader();
                int t = fast.nextInt();
                while(t-->0){
                    int lookup[]= new int[10000000];
                    int n = fast.nextInt();
                    int sum = 0;
                    for (int i=0;i<n;i++){
                        lookup[i] = fast.nextInt();
                        sum+=lookup[i];
                    }

                    for (int i = n,j = 0;i < lookup.length;i++,j++){
                        lookup[i] = sum/n;
                        sum+=lookup[i];
                     //   System.out.println(sum+"i :"+i);
                         sum-=lookup[j];
                       // System.out.println("lookupA :"+lookup[i]+" : index :"+i);
                    }

                    int q = fast.nextInt();
                    while (q-->0){
                        int qry =fast.nextInt() - 1;
                       System.out.println(lookup[Math.min(qry,lookup.length-1)]);
                    }
                }
            }catch (Exception e){
                return;
            }
        }

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
