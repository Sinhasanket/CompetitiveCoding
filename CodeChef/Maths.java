package Codechef;

import java.math.BigInteger;

public class Maths {
    public static void main(String[] args){
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("2");
        BigInteger c = new BigInteger("1");
        BigInteger sum = new BigInteger("2");
        BigInteger two = new BigInteger("2");

        for (int i=3;i<=4000000;i++){

            c = a.add(b);
            if (c.mod(two).equals(0)) sum=sum.and(c);
            a=b;
            b=c;
        }
        System.out.println(sum);
    }
}
