package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HardSequence {
    public static void main(String[] args){
        try{
            FastReader reader = new FastReader();
            int hardSequence[] = new int[130];
            hardSequence[0]=0;
            hardSequence[1]=0;
            hardSequence[2]=1;

            for (int i=3;i<=129;i++){
                int newElement = 0;
                for (int j=i-2;j>=0;j--){
                    if(hardSequence[j]==hardSequence[i-1]){
                        newElement = i-j;
                        break;
                    }
                }
                if (newElement != 0) hardSequence[i] = newElement-1;
                else hardSequence[i] = newElement;
            }

            int t = reader.nextInt();
            while(t-->0){
                StringBuffer sb = new StringBuffer();
                int n = reader.nextInt();
                int count = 0;
                int search = hardSequence[n-1];
                for (int i=0;i<n;i++){
                    if(search==hardSequence[i]) count++;
                }
                sb.append(count);
                System.out.println(sb);
            }

        }catch (Exception e){
            return;
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
    }
}
