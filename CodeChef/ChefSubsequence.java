package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class ChefSubsequence {

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
    }

    public static void main(String[] args) {

        try{
            FastReader sc = new FastReader();
            int t = sc.nextInt();
            while(t-->0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                int arr[] = new int[n];
                for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
                ArrayList<Integer> al = new ArrayList<>();
                boolean[] boo = new boolean[arr.length];
                findSubset(arr, k, 0, 0, boo,al);
                int count=0;
                Collections.sort(al);
                int min = al.get(0);
                for(int i=0;i<al.size();i++){
                    if(min==al.get(i)) count++;

                }
                StringBuffer sb = new StringBuffer();
                sb.append(count);
                System.out.println(sb);
            }
        }catch (Exception e){
            return;
        }
    }
    private static void findSubset(int[] arr, int k, int start, int curr, boolean[] visited,ArrayList<Integer> al) {
        if (curr == k) {
            int sum=0;
            for (int i = 0; i < arr.length; i++) {
                if (visited[i] == true) sum+=arr[i];
            }
            al.add(sum);
            return;
        }
        if (start == arr.length) return;

        visited[start] = true;
        findSubset(arr, k, start + 1, curr + 1, visited, al);
        visited[start] = false;
        findSubset(arr, k, start + 1, curr, visited,al);
    }
}