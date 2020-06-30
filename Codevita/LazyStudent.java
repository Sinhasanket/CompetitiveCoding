package Codevita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LazyStudent {
    static int MOD = 1000000007;
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(sc.readLine());
        StringBuffer sb = new StringBuffer();
        while (t-->0){
            String inp = sc.readLine();
            String arr[] = inp.split(" ");
            int n = Integer.parseInt(arr[0]);
            int tt = Integer.parseInt(arr[1]);
            int m = Integer.parseInt(arr[2]);
          // 1-((n-m,tt)/(n,tt))
          // (x,y) = xCy
            int ans = 1-(nCr(n-m,tt))/nCr(n,tt);
            System.out.println(ans);
        }
        System.out.println(sb);
    }

    static int nCr(int n, int r) {
        return fact(n) / (fact(r) * fact(n - r));
    }

    static int fact(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++)
            res = res * i;
        return res;
    }
}
