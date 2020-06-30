package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PlayStr {

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


    public static void main(String[] args) throws IOException{
        try{
            FastReader sc = new FastReader();
            int test =sc.nextInt();
            while(test-->0){
                int n = sc.nextInt();
                String s = sc.nextLine();
                String r = sc.nextLine();
                int sone=0;
                int szero=0;
                for(int i=0;i<n;i++){
                    if(s.charAt(i)=='0'){
                        szero++;
                    }else if(s.charAt(i)=='1') {
                        sone++;
                    }
                }
                int rzero=0;
                int rone=0;
                for(int j=0;j<n;j++){
                    if(r.charAt(j)=='0'){
                        rzero++;
                    }else if(r.charAt(j)=='1') {
                        rone++;
                    }
                }
                if(sone==rone || szero==rzero){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }






        }catch (Exception e){
            return;
        }
    }

}


//       Input
//        2
//        5
//        11000
//        01001
//        3
//        110
//        001
//        Output
//        YES
//        NO