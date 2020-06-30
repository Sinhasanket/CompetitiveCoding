package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Covid19 {
    int mod = 1000000007;

    public static void main(String[] args) throws IOException{
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int inf=1;
            ArrayList<Integer> list = new ArrayList<>();
            list.clear();
            for (int i=0;i<n-1;i++){
                if (arr[i+1]-arr[i] <=2){
                    inf++;
                }else {
                    list.add(inf);
                    inf=1;
                }
            }
            list.add(inf);
            Collections.sort(list);
          //  System.out.println(list);
            if (list.size()==1){
                System.out.println(list.get(0)+" "+list.get(0));
            }else {
                System.out.println(list.get(0)+" "+list.get(list.size()-1));
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
