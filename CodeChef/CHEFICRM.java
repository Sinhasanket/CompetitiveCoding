package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class CHEFICRM {
    int mod = 1000000007;
    public static void main(String[] args) throws IOException{
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        //consider 5 , 10 and 15 as a whole we can't divide 15 if we want to return 5
        while (t-->0) {
            int n = sc.nextInt();
            long earnedMoney = 0;
            long coinHave[]=new long[n];
            for (int i=0;i<n;i++)coinHave[i]=sc.nextLong();
            HashMap<Long,Integer> coins = new HashMap<>();
            coins.put(5L,0);coins.put(10L,0);coins.put(15L,0);
            if (coinHave[0]==5){
                int get = coins.get(coinHave[0])+1;
                coins.put(coinHave[0],get);
                earnedMoney+=5;
                boolean possible = true;
                for (int i=1;i<n;i++){
                    get = coins.get(coinHave[i]);
                    if (coinHave[i]==5){
                        earnedMoney+=5;
                        get = get+1;
                        coins.put(coinHave[i],get);
                    }else if (coinHave[i]==10){
                        int giveBackFive = coins.get(5L);
                        if (giveBackFive >= 1){
                              get = coins.get(5L) -1;
                              coins.put(5L,get);
                              get = coins.get(10L)+1;
                              coins.put(10L,get);
                              earnedMoney+=5;
                        }else {
                            possible = false;
                        }
                    }else if (coinHave[i]==15){
                        int giveBackTen = coins.get(10L);
                        int giveBackTwoFive = coins.get(5L);
                        if (giveBackTen >= 1){
                           get = coins.get(10L)-1;
                           coins.put(10L,get);
                           get = coins.get(15L)+1;
                           coins.put(15L,get);
                           earnedMoney+=5;
                        }else if(giveBackTwoFive >= 2){
                            get = coins.get(5L)-2;
                            coins.put(5L,get);
                            get = coins.get(15L)+1;
                            coins.put(15L,get);
                            earnedMoney+=5;
                        } else {
                            possible = false;
                        }
                    }
                }
              //  System.out.println(coins +" "+earnedMoney);
                if (possible) System.out.println("YES");
                else System.out.println("NO");
            }else {
                System.out.println("NO");
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