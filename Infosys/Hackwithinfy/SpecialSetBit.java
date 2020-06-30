package Infosys.Hackwithinfy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class SpecialSetBit {
    public static void main(String[] args) throws IOException {
        HashSet<Long> pri = new HashSet<>();
        int max = 100001;
        sieveOfEratosthenes(40,pri);
        InputStreamReader rr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(rr);
        int t = Integer.parseInt(br.readLine());
        HashMap<Long,Long> map = new HashMap<>();
        while (t-->0){
            String inp = br.readLine();
            String cc[]=inp.split(" ");
            long l = Long.parseLong(cc[0]);
            long r = Long.parseLong(cc[1]);
            map.put(l,r);
        }
        long minL = Long.MAX_VALUE;
        long maxR = Long.MIN_VALUE;
        for (Map.Entry it : map.entrySet()){
            long k = (long) it.getKey();
            long v = (long) it.getValue();
            if (k < minL)minL=k;
            if (v > maxR)maxR=v;
        }
        long arr[]=new long[max];
        for (long i=0;i<=maxR;i++){
            long count=0;
            for (long bit=32;bit>=1;bit--){
                if((i&(1<<(bit-1)))==1<<(bit-1)){
                    if (pri.contains(i))count++;
                }
            }
            arr[(int)i] = count;
        }
        long prefix[]=new long[(int)maxR];
        prefix[0] = arr[0];
        for (int i=1;i<max;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for (Map.Entry it : map.entrySet()){
            int l = (int) it.getKey();
            int r = (int) it.getValue();
            System.out.println(prefix[r] - prefix[l-1]);
        }
    }

    static void sieveOfEratosthenes(int n, HashSet<Long> hh) {
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<n;i++)
            prime[i] = true;

        for(int p = 2; p*p <=n; p++) {
            if(prime[p] == true) {
                for(int i = p*2; i <= n; i += p)
                    prime[i] = false;
            }
        }
        for(int i = 2; i <= n; i++) {
            if(prime[i] == true)
                hh.add((long)i);
        }
    }
}

//(1<<(bit-1)))==1<<(bit-1)
