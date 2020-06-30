package Codechef;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Brkbks {

    public static void main(String[] args) {
        try{
            FastReader fast = new FastReader();
            for (int t=fast.nextInt();t>0;t--){
                int Strength = fast.nextInt();
                int weight1 = fast.nextInt();
                int weight2 = fast.nextInt();
                int weight3 = fast.nextInt();

                int totalWeights = weight1+weight2+weight3;
                boolean flag = true;
                if (totalWeights <= Strength) System.out.println(1);
                else{
                    int hits=0;
                    if (weight1+weight2 <= Strength){
                        hits++;
                        if (weight3 <= Strength) hits++;

                    }else if(weight2+weight3 <= Strength){
                        hits++;
                        if (weight1 <= Strength) hits++;
                    }else{
                        System.out.println(3);
                        flag = false;
                    }
                    if (flag) System.out.println(hits);
                }
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
