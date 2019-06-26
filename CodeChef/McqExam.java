package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

 public class McqExam {
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
          FastReader in = new FastReader();
          int t = in.nextInt();
          if(t<=100){
              while (t-- > 0) {
                  int len = in.nextInt();
                  if(len<=100){
                      String optStr = in.next();
                      String ansStr = in.next();
                      char optChar[] = optStr.toCharArray();
                      char anStr[] = ansStr.toCharArray();
                      int marks = 0;
                      for (int i = 0; i <=len - 2; i++) {
                          if (optChar[i] == anStr[i]) {
                              marks=marks+1;
                          } else if (anStr[i] == 'N') {
                              marks=marks+0;
                          } else if ((optChar[i] != anStr[i]) && (optChar[i+1] == anStr[i+1]) && (anStr[i]!='N') ) {
                              i++;
                              marks=marks+0;
                          }
                      }
                      if((optChar[len-1]==anStr[len-1])){
                          if((optChar[len-3]!=anStr[len-3]) ){
                              marks++;
                          }

                          else if((optChar[len-2]==anStr[len-2]) || (anStr[len-2]=='N'))
                          marks++;
                      }
                      System.out.println(marks);
                  }
              }
          }
      }catch(Exception e){
          return;
      }

    }
}