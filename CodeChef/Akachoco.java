package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Akachoco {
    public static void main(String[] args){
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        StringBuffer sb = new StringBuffer();
        while (t-->0){
            int n = fr.nextInt();
            int x = fr.nextInt();
            int arr[]=new int[n+1];
            for (int i=1;i<=n;i++)arr[i]=fr.nextInt();
            Arrays.sort(arr);
            if (arr[1]==1){
                sb.append("Impossible").append("\n");
            }else{
              boolean flag = true;
              int temp[]=new int[n+1];
              for (int i=1;i<=n;i++){
                  temp[arr[i]]++;
              }

              for (int i=1;i<=n;i++){
                  if(temp[i] <=x || arr[i] > i+1)continue;
                  else {
                      flag=false;
                      break;
                  }
              }

              if (flag)  sb.append("Possible").append("\n");
              else  sb.append("Impossible").append("\n");
            }
        }
        System.out.println(sb);
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
