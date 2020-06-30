package Infosys.Hackwithinfy;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    }

    public static void sieveOfEratosthenes(int N, int s[]) {
        boolean[] prime = new boolean[N + 1];
        for (int i = 2; i <= N; i += 2)
            s[i] = 2;
        for (int i = 3; i <= N; i += 2) {
            if (prime[i] == false) {
                s[i] = i;
                for (int j = i; j * i <= N; j += 2) {
                    if (prime[i * j] == false) {
                        prime[i * j] = true;
                        s[i * j] = i;
                    }
                }
            }
        }
    }

        public static void generatePrimeFactors(int N) {
        int[] s = new int[N + 1];
        sieveOfEratosthenes(N, s);

        System.out.println("Factor Power");

        int curr = s[N]; // Current prime factor of N
        int cnt = 1; // Power of current prime factor
        while (N > 1) {
            N /= s[N];
            if (curr == s[N]) {
                cnt++;
                continue;
            }

            System.out.println(curr + "\t" + cnt);
            curr = s[N];
            cnt = 1;
        }
    }
}
