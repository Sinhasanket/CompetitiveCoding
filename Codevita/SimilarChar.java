package Codevita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SimilarChar {

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

    }

    public static void main(String[] a) throws IOException {
        try{
           FastReader input = new FastReader();
            int lenght_Of_String = input.nextInt();
            String get_string = input.next();
            char get_char[] = get_string.toCharArray();
            int query = input.nextInt();
            for(int j=0;j<query;j++){
                int queries = input.nextInt();
                int count=0;
                for(int i=0;i<queries-1;i++){
                    if(get_char[i]==get_char[queries-1]){
                        count++;
                    }
                }
                StringBuffer buffer = new StringBuffer();
                buffer.append(count);
                System.out.println(buffer);
            }
        }catch(Exception e){
            return;
        }
    }
}

//        Input
//        9
//        abacsddaa
//        2
//        9
//        3
//        Output
//        3
//        1