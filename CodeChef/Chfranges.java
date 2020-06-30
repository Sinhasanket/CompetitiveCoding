package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Chfranges {

    public static class Pair implements Comparable<Pair>{
        int val;
        int col;
        Pair(int v, int c){
            this.val = v;
            this.col = c;
        }
        public int compareTo(Pair o){
            if (this.val==this.val) return 0;
            else return 1;
           // return this.val - o.val;
        }
    }

    public static void main(String[] args){
           FastReader fast = new FastReader();
           int TestCase = fast.nextInt();
           while(TestCase-->0){
               int N = fast.nextInt();

             //  ArrayList<Pair<Integer,Integer>> arrayListElements = new ArrayList<>();
               //arrayListElements.clear();
               Pair arr[] = new Pair[N];
               for(int i=0; i < N; i++){
                   Integer a = fast.nextInt();
                   Integer b = fast.nextInt();
                   Pair p = new Pair(a,b);
                 //  arrayListElements.add(new Pair<>(a,b));
                   arr[i] = p;

               }
                 Arrays.sort(arr);
//               Collections.sort(arrayListElements, new Comparator<Pair<Integer, Integer>>() {
//                   @Override
//                   public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
//                       if(o1.getValue() == o2.getValue()) return 0;
//                       else return 1;
//                   }
//               });

               int ans = N;
               for(int ii=1; ii<N; ii++){
                   int Temporary = 0;
                   for(int jj=0; jj<ii; jj++){
                     //  if(arrayListElements.get(jj).getValue() >= arrayListElements.get(ii).getKey()) Temporary++;
                       if (arr[jj].val >= arr[ii].val ) Temporary++;
                   }
                   if(Temporary != ii) ans = Math.min(ans,Temporary);
               }
               if(ans != N) System.out.println(ans);
               else System.out.println(-1);
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
