package Codevita;

import java.util.*;

//AC

public class PrimeFibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        ArrayList<Long> allPrimes = new ArrayList<>();
        for (long i=a;i<=b;i++){
            if (isPrime(i)){
                allPrimes.add(i);
            }
        }
       // System.out.println(allPrimes);
        ArrayList<Long> allPrimesReduced = new ArrayList<>();
        for (int i=0;i<allPrimes.size();i++){
            for (int j=0;j<allPrimes.size();j++){
                if (i != j){
                    String check = allPrimes.get(i)+""+allPrimes.get(j);
                    long primeCheck = Integer.parseInt(check);
                    if (isPrime(primeCheck)){
                        allPrimesReduced.add(primeCheck);
                    }
                }
            }
        }
        long smallest = Collections.min(allPrimesReduced);
        long largest = Collections.max(allPrimesReduced);
        HashSet<Long> set = new HashSet<>(allPrimesReduced);
        long nth = set.size();

//        System.out.println(smallest+" "+largest+" "+nth);

        long dp[] = new long[(int)nth+1];
        dp[0] = smallest;
        dp[1] = largest;
        for (int i=2;i<=nth;i++){
            dp[i] = dp[i-1]+dp[i-2];
            //System.out.println(dp[i]);
        }
        System.out.print(dp[(int)nth-1]);
    }

    public static boolean isPrime(long n){
        if (n==1)return false;
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0)return false;
        }
        return true;
    }
}
