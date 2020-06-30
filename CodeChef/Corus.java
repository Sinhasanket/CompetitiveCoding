package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Corus {
    int mod = 1000000007;

    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while(t-->0){
            int pat = sc.nextInt();
            int q = sc.nextInt();
            String str = sc.next();
            HashMap<Character,Integer> map = new HashMap<>();
            for(int i=0;i<str.length();i++){
                if(!map.containsKey(str.charAt(i))){
                    map.put(str.charAt(i),1);
                }else {
                    int inc = map.get(str.charAt(i))+1;
                    map.put(str.charAt(i),inc);
                }
            }
          //  System.out.println(map);
            while (q-->0){
                int qr = sc.nextInt();
                int ans = 0;
                for (Map.Entry it : map.entrySet()){
                    int val = (int) it.getValue();
                    if (val > qr){
                        ans += (val-qr);
                    }
                }
                System.out.println(ans);
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
