package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Subsplay {


    public static void main(String[] args){
        try{
            FastReader fast = new FastReader();

            int TestCase = fast.nextInt();

            while(TestCase-->0){
                int lengthOfString = fast.nextInt();

                String inpString = fast.next();

                int Answer=0;
                int previous;

                ArrayList<Integer> li[]=new ArrayList[26];

                for (int i = 0; i < 26; i++) {
                    li[i] = new ArrayList<>();
                }

              //  System.out.println(li);

                for (int i = 0; i < inpString.length(); i++) {
                    char getcharVarialble = inpString.charAt(i);
                    li[(int)(getcharVarialble-'a')].add(i);
                   // System.out.println(getcharVarialble-'a');
                }

                for (ArrayList<Integer> SubsequenceArray : li) {

                    for (int ii = 0; ii < SubsequenceArray.size() - 1; ii++) Answer = Math.max(Answer, SubsequenceArray.get(ii));


                    for (int j = 1; j < SubsequenceArray.size(); j++) Answer = Math.max(Answer,(lengthOfString) - SubsequenceArray.get(j));


                    if(SubsequenceArray.size()>1) previous=SubsequenceArray.get(0);
                    else continue;
                    for (int k = 1; k < SubsequenceArray.size(); k++) {

                        Answer = Math.max(Answer,lengthOfString - (SubsequenceArray.get(k) - previous));

                        previous = SubsequenceArray.get(k);
                    }
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

//8
//abbracad
//abracad
//abracad

//8
//  ackapaal
//ackapl
//ackapl

//abbracad
//bracad

//ackapaal
//apaal