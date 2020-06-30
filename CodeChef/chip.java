package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class chip {
    public static void main(String[] args){
      FastReader f = new FastReader();
      int t = f.nextInt();
      while(t-->0){
          int n = f.nextInt();
          int m = f.nextInt();
          int arr[]=new int[n];
          int arrr[]=new int[n];
          for (int i=0;i<n;i++)arr[i]=f.nextInt();
          for (int i=0;i<n;i++)arrr[i]=f.nextInt();
          HashMap<Integer,Integer> hm = new HashMap<>();
          for (int i=0;i<n;i++){
              int num = arr[i];
              if (hm.containsKey(num)){
                  int gg = hm.get(num)+arrr[i];
                  hm.put(num,gg);
              }else hm.put(num,arrr[i]);
          }
          int min = Integer.MAX_VALUE;
          for (Map.Entry ii: hm.entrySet()){
              int val = (int)ii.getValue();
              if (val < min) min = val;
          }
          System.out.println(min);
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
