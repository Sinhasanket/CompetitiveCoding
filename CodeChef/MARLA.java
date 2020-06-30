package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class MARLA {
        int mod = 1000000007;
        static int componentsSize = 0;
        public static void main(String[] args) throws IOException{
            FastReader sc = new FastReader();
            int n = sc.nextInt();
            int m = sc.nextInt();
            long graph[][] = new long[n][m];
            for (int i=0;i<n;i++){
                for (int j=0;j<m;j++){
                    graph[i][j] = sc.nextInt()-1;
                }
            }
            boolean visited[] = new boolean[n];
            long minStrength = 0;
            long size = Integer.MIN_VALUE;
            TreeMap<Long,Long> li = new TreeMap<>();
            for (int i=0;i<n;i++){
                    if (!visited[i]){
                        componentsSize=0;
                        dfs(i,graph,visited);
                        if (componentsSize > size){
                            size = componentsSize;
                            minStrength = 
                            li.put(minStrength+1,size);
                        }
//                        else if(componentsSize==size && graph[i][j] < minStrength){
//                            li.put(minStrength+1,size);
//                        }
                }
            }
            System.out.println(li);
            //System.out.println((minStrength+1)+" "+size);
        }

        public static void dfs(int i,long graph[][],boolean vis[]){
            componentsSize++;
            vis[i] = true;
            for (int c=0;c<graph.length;c++){
                if (!vis[i]) {
                    dfs(i,graph,vis);
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

