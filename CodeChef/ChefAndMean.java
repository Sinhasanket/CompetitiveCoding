package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChefAndMean {

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

    public static void main(String[] a){
         try{
             FastReader in = new FastReader();
             int t = in.nextInt();
             while(t-->0){
                 int n = in.nextInt();
                 long arr[] = new long[n];
                 long sum =0;
                 for(int i=0;i<n;i++){
                     arr[i]=in.nextLong();
                     sum+=arr[i];
                 }
                 if(solve(arr,sum,n) == 0)   {
                     System.out.println("Impossible");
                 }else{
                     System.out.println(solve(arr,sum,n));
                 }
             }
         }catch(Exception e) {
             return;
         }
    }

    static int solve(long arr[],long sum,int n){
        int count=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
        }
        if(count==arr.length-1){
            return 1;
        }else if(count !=arr.length-1)  {
            double summ = sum;
            double N = (long) n;
            double mean = summ/n;

            double size=N;
            size=size-1;

            for(int k=0;k<n;k++){
                double redsum = summ-arr[k];
                double elemean = redsum/size;
                if(mean==elemean){
                    return (k+1);
                }
            }
        }
        return 0;
    }
}

//        Input
//        3
//        5
//        1 2 3 4 5
//        4
//        5 4 3 6
//        10
//        1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000
//        Output
//        3
//        Impossible
//        1