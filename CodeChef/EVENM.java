package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
//for Even values
//| e o e o
//| o e o e
//| e o e o
//| o e o e
//Otherwise print as it is

public class EVENM {
    int mod = 1000000007;

    public static void main(String[] args) throws IOException{
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        StringBuffer finalPrint = new StringBuffer();
        while (t-->0){
            int n = sc.nextInt();
            long max = n*n;
            if (max%2==0){
                ArrayList<Integer> even = new ArrayList<>();even.clear();
                ArrayList<Integer> odd = new ArrayList<>();odd.clear();
                for (int i=1;i<=max;i++){
                    if (i%2==0)even.add(i);
                    else odd.add(i);
                }
                int ans[][]=new int[n+1][n+1];
                int ev=0,od=0;
                for (int i=1;i<=n;i++){
                    for (int j=1;j<=n;j++){
                            if(i%2!=0){
                                if ((i+j)%2==0 && ev < even.size()){
                                    ans[i][j] = even.get(ev);
                                    ev++;
                                }else {
                                    ans[i][j] = odd.get(od);
                                    od++;
                                }
                            }else {
                                if((i+j)%2==0){
                                    ans[i][j] = even.get(ev);
                                    ev++;
                                }else {
                                    ans[i][j]=odd.get(od);
                                    od++;
                                }
                            }
                        finalPrint.append(ans[i][j]).append(" ");
                        }
                    finalPrint.append("\n");
                    }
            }else {
                int x = 1;
                for (int i=0;i<n;i++){
                    for (int j=0;j<n;j++){
                        finalPrint.append(x).append(" ");
                        x++;
                    }
                    finalPrint.append("\n");
                }
            }
        }
        System.out.print(finalPrint);
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