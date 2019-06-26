package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ModifiedBubble {
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

    public static void main(String[] a){
        try{
            FastReader fr = new FastReader();
            int num = fr.nextInt();
            int ar[] = new int[num];
            int copy[] = new int[num];
            for(int i=0;i<num;i++){
                ar[i] = fr.nextInt();
                copy[i] = ar[i];
            }
            Arrays.sort(copy);
            bubble(ar,ar.length);
            int count=0;
            for(int i=0;i<ar.length;i++){
                if(copy[i]!=ar[i]){
                    System.out.println(i);
                    break;
                }else{
                    count++;
                }
            }
            if(count==ar.length){
                System.out.println("OK");
            }

         }catch(Exception e){
             return;
         }
    }

    static void bubble(int ar[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-2;j++){
                if(ar[j] > ar[j+2]){
                    int temp = ar[j+2];
                    ar[j+2] = ar[j];
                    ar[j] = temp;
                }
            }
        }
    }
}

//input
//5
//5 6 6 4 3
//output
//OK
//input
//3
//8 9 7
//output
//1