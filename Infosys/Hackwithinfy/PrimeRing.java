package Infosys.Hackwithinfy;

import java.util.HashSet;
import java.util.Scanner;

public class PrimeRing {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> primes = new HashSet<>();
        primes.add(2);primes.add(3);primes.add(5);primes.add(7);
        primes.add(13);primes.add(17);primes.add(23);
        int arr[]=new int[n];
        arr[0]=1;
        for (int i=1;i<=n;i++){
            arr[i]=i+1;arr[i+1]=i+2;
            arr[i-1]=i;
            if(!isValid(i,arr,primes)){

            }
        }
    }

    public static boolean isValid(int si,int arr[], HashSet<Integer> primes){
        if (primes.contains(arr[si-1]+arr[si+1]+arr[si])){
            return true;
        }
        return false;
    }
}
