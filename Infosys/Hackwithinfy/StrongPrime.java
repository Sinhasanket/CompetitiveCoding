package Infosys.Hackwithinfy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//getting TLE can't optimise further huh!

public class StrongPrime {
    static HashSet<Integer> pri = new LinkedHashSet<>();
    static int MAX=1000001;
    public static void main(String[] args) throws IOException {
        FIO sc = new FIO();
        sieve(1000000);
        int t = sc.nextInt();
        StringBuffer sb = new StringBuffer();
        int arr[]=new int[MAX+1];
        for (int i=2;i<MAX;i++){
            if (pri.contains(i) && isStrongPrime(i)){
                arr[i]=1;
            }
        }
        int prefix[]=new int[MAX+1];
        prefix[0]=arr[0];
        for (int i=1;i<MAX;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        while(t-->0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = prefix[r]-prefix[l-1];
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }

    public static void sieve(int n){
        boolean prime[]=new boolean[n+1];
        for (int i=0;i<n;i++)prime[i]=true;
        for (int i=2;i*i<=n;i++){
            if (prime[i]){
                for (int j=2*i;j<=n;j+=i){
                    prime[j]=false;
                }
            }
        }
        for (int i=2;i<=n;i++){
            if (prime[i]){
                pri.add(i);
            }
        }
    }

    static boolean isStrongPrime(int n) {
        if (!pri.contains(n) || n == 2) return false;
        ArrayList<Integer> li = new ArrayList<>(pri);
        int idx = Collections.binarySearch(li,n);
        int previous_prime = idx - 1;
        int next_prime = idx + 1;
        int mean = (li.get(previous_prime) + li.get(next_prime)) / 2;
        if (n > mean) return true;
        else return false;
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
    }
}