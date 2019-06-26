package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class SumGcd {

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

        long nextLong() {
            return Long.parseLong(next());
        }
    }

    public static void main(String[] a){

        try{
            FastReader in = new FastReader();
            ArrayList<Long> setB = new ArrayList<>();
            ArrayList<Long> setA = new ArrayList<>();
            long test = in.nextLong();
            if(test>=1&& test<=10) {
                while (test-- > 0) {
                    long numLen = in.nextLong();
                    if (numLen >= 2 && numLen <= 20) {
                        for (int i = 0; i < numLen; i++) {
                            long num = in.nextLong();
                            setA.add(num);
                        }
                        Collections.sort(setA);
                        System.out.println("set a sorting :" + setA);
                        long arr[] = new long[20];
                        for (int m=0;m<arr.length;m++){
                            arr[m] = findGCD(setA);
                        }
                        for (int m=0;m<arr.length;m++){
                            System.out.println("gcds"+arr[m]+" ");
                        }


                        setB.add(setA.get(setA.size() - 1));
                        setA.remove(setA.get(setA.size() - 1));

                        for (int i = 0; i < setA.size(); i++) {
                            System.out.println("set a :" + setA.get(i) + " ");
                        }
                        for (int i = 0; i < setB.size(); i++) {
                            System.out.println("set b :" + setB.get(i) + " ");
                        }

                        long resA = findGCD(setA);
                        System.out.println("gcd a :" + resA);
                      //  long resB = setB.get(setB.size() - 1);
                        long ressb = findGCD(setB);
                        System.out.println("res b :" + ressb);
                        long result = resA + ressb;
                        System.out.println("result :" + result);
                        System.out.println(result);
                        setA.removeAll(setA);
                        setB.removeAll(setB);
                    }
                }
            }
        }catch(Exception e){
            return;
        }
    }

    static long findGCD(ArrayList<Long> alist) {
        long result = alist.get(alist.size()-1);
        for (int i = 0; i < alist.size(); i++)
            result = gcd(alist.get(i), result);
        return result;
    }

    public static long gcd(long a,long b){
        if(b==0){
            return a;
        }else{
            return gcd(b,a%b);
        }
    }
}

//5
//9
//3 5 7 11 13 17 19 23 29
//30
//9
//4 6 8 10 12 14 16 20 24
//26
//9
//3 5 7 11 12 14 16 20 26
//27
//9
//4 6 8 10 12 17 19 23 29
//30
//20
//3 5 7 11 13 17 19 23 29 4 6 8 10 12 14 16 20 24 50 53
//54
//4
//4 4 7 6
//9
//9
//4 6 6 10 10 17 19 29 29