package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//Binary Search the element XD

public class GUESSG {
    int mod = 1000000007;
    public static void main(String[] args) throws IOException{
        FastReader inp = new FastReader();
        long n = inp.nextLong();
        int initial = 1;
        long start = 1,end = n;
        long start1 = 1 ,end1 = n;
        long mid = start + (end - start) / 2;
        long mid1 = start1 + (end1 - start1) / 2;
        while (true){
            if (initial%2==0){
                    System.out.println(mid);
                    System.out.flush();
                    char ans = inp.next().charAt(0);
                    if (ans=='E'){
                        break;
                    }else if (ans=='G'){
                        start = mid + 1;
                    }else if (ans=='L'){
                        end = mid - 1;
                    }
                   mid = start + (end - start) / 2;
            }else {

                    System.out.println(mid1);
                    System.out.flush();
                    char ans = inp.next().charAt(0);
                    if (ans=='E'){
                        break;
                    }else if (ans=='G'){
                        start1 = mid1 + 1;
                    }else if (ans=='L'){
                        end1 = mid1 - 1;
                    }
                  mid1 = start1 + (end1 - start1) / 2;
            }
            initial++;
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
