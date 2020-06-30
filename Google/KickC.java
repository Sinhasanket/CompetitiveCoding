package Google;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class KickC {
    int mod = 1000000007;

    public static void main(String[] args) throws IOException {
        FIO sc = new FIO();
        int z=1;
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int count=0;
//            int x=0;
            boolean flag = false;
//            for (int i=0;i<n-1;i++){
//               // System.out.println(count);
//               // System.out.println(arr[i]+" "+arr[i+1]);
//                if (arr[i]-arr[i+1]==1 && arr[i] > arr[i+1]){
//                    x++;
//                   // System.out.println("got this :"+arr[i]+" "+arr[i+1]);
//                    System.out.println(x+" : count x");
//                }else{
//                    if (x>=k-1){
//                        count++;
//                        flag = false;
//                    }
//                    x=0;
//                }
//            }

            for (int i=0;i<k-1;i++){
                if (arr[i+1] < arr[i] && arr[i]-arr[i+1]==1){
                    count++;
                }
            }


            for (int i=k;i<n-k+1;i++){
                for (int j=i;j<i+k-1;j++){
                   // System.out.print(arr[j]+" "+arr[j+1]);
                    if (arr[j+1] < arr[j] && arr[i]-arr[j+1]==1){
                        count++;
                    }
                }
                System.out.println();
            }





            System.out.println("Case #"+z+": "+ ((flag) ? 0 : count-1));
            z++;
        }
    }

    static class FIO {
        BufferedReader br;
        StringTokenizer st;

        public FIO() {
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