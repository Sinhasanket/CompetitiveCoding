package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Robogame {
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
    public static void main(String[] args){
        try{
            FastReader in = new FastReader();
            int t = in.nextInt();
            while(t-->0){
                String str = in.next();
                int count=0;
                for (int i=0;i<str.length();i++)
                    if (str.charAt(i) != '.') count++;

                if (count==0||count==1) System.out.println("safe");
                else{
                    int leftRange = -1;
                    int rightRange = -1;
                    boolean flag = true;
                    for (int i=0;i<str.length();i++) {
                        if (str.charAt(i) != '.') {
                            int num = Character.getNumericValue(str.charAt(i));
                            leftRange = i - num-'0';
                            if (rightRange != -1 && leftRange <= rightRange){
                                System.out.println("unsafe");
                                flag = false;
                                break;
                            }
                            rightRange = i + num-'0';
                        }
                    }
                    if (flag) System.out.println("safe");
                }
            }
        }catch (Exception e){
            return;
        }
    }
}