package Infosys.Hackwithinfy;

import java.util.Scanner;

public class ClassRoomQueue {
    static int MOD = 1000000007;
    static long B[] =new long[1000001];
    static long G[] =new long[1000001];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        B[1]=0;B[2]=0;B[3]=1;
        G[0]=0;G[2]=0;G[3]=0;
        for(long i=4; i<=1000000; i++) {
           long j = i-3;
           B[(int)i]= power(2,j,MOD)+G[(int)i-1]+G[(int)i-2];
           G[(int)i]=B[(int)i-1]+G[(int)i-1];
        }
        long T =sc.nextLong();
        while(T-->0) {
            long N  = sc.nextLong();
            long first = power(2,N,MOD);
            long second = B[(int)N]+G[(int)N];
            long result = first - second;
            result=(result%MOD);
            System.out.println(result);
        }
    }

    public static long power(long a, long n, long p) {
        long res=1;
        while(n != 0) {
            if((n&1)==0){
                res=(res*a)%p;
                n--;
            }else {
                a=(a*a)%p;
                n/=2;
            }
        }
        return res;
    }
}