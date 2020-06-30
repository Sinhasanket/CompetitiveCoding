package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FireEscapeRoute {
    static int MOD=1000000007;
    static int temp;
    public static void main(String[] args) throws IOException{
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            ArrayList<ArrayList<Integer>> adj =
                    new ArrayList<ArrayList<Integer>>(n+1);
            for (int i=0;i<n+1;i++){
                adj.add(new ArrayList<Integer>());
            }
            while (m-->0){
                int u = sc.nextInt();
                int v = sc.nextInt();
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            boolean visited[]=new boolean[n+1];
            Arrays.fill(visited,false);
            int countComponents=0;
            long ways = 1;
            for (int i=1;i<=n;i++){
                if (visited[i]==false){
                   temp = 0;
                   countComponents++;
                   dfs(visited,adj,i);
                   ways=(ways*temp)%MOD;
                }
            }
            System.out.println(countComponents+" "+ways);

        }
    }

    public static void dfs(boolean visited[],ArrayList<ArrayList<Integer>> adj, int src){
        visited[src] = true;
        temp++;
        for (int i=0;i<adj.get(src).size();i++){
            if (!visited[adj.get(src).get(i)]){
                dfs(visited,adj,adj.get(src).get(i));
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