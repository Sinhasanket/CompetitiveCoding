package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Watascore {
    public static void main(String[] args) {
        try{
            FastReader fast = new FastReader();
            int Testcase = fast.nextInt();
            while(Testcase-->0){
                int submissions = fast.nextInt();
                HashMap<Integer,Integer> storeScore = new HashMap<>();
                while(submissions-->0){
                    int problemNumber = fast.nextInt();
                    int score = fast.nextInt();

                    if(problemNumber > 8){
                        continue;
                    }else{

                        if( !storeScore.containsKey(problemNumber) ){
                            storeScore.put(problemNumber,score);
                        }else{
                            int replace = storeScore.get(problemNumber);
                            //  System.out.println(replace);
                            if(replace < score ){
                                storeScore.replace(problemNumber,replace,score);
                            }
                        }
                    }
                }
              //  System.out.println(storeScore);
                int Answer =0;
                for(Map.Entry Values : storeScore.entrySet()){
                    int val = (int)Values.getValue();
                    Answer+=val;
                }

                StringBuffer sb = new StringBuffer();
                sb.append(Answer);
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