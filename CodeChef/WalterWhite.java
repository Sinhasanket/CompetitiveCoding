package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WalterWhite {
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
           FastReader inp = new FastReader();
            String ci = inp.next();
            String cipher = ci.toLowerCase();
            int k1 = inp.nextInt();
            int k2= inp.nextInt();
            int k2inverse = modInverse(k2,26);
            int decrypt[] = new int[cipher.length()];
            for(int i=0;i<cipher.length();i++){
                int dec = (((cipher.charAt(i)-'a')-k1)*k2inverse) % 26;
                if(dec<0){
                    dec=26+dec;
                }
                decrypt[i] = dec;
            }
           int arr[] = new int[cipher.length()];
            for(int i=0;i<cipher.length();i++){
             arr[i]=decrypt[i]+'A';
             char c = (char) arr[i];
                System.out.print(c);
            }

        }catch (Exception e){
            return;
        }

    }
//    P=(C−K1)×K−12 mod 26;
    static int modInverse(int a, int m) {
        a = a % m;
        for (int x = 1; x < m; x++)
            if ((a * x) % m == 1)
                return x;
        return 1;
    }
}

