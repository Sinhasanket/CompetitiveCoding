package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

class Binadd {

    public static BigInteger zero = new BigInteger("0");
    public static BigInteger n = new BigInteger("2");

    public static void main(String[] args){
        try{
            FastReader fast = new FastReader();
            int TestCase = fast.nextInt();
            while(TestCase-->0){

                String A = "0"+fast.next();
                String B = "0"+fast.next();

                if(A.length() < 30 && B.length() < 30){
                    StringBuffer sb = new StringBuffer();
                    sb.append(add(toDecimal(A),toDecimal(B)));
                    System.out.println(sb);
                }else{

                    if (B.equals("00")) {
                        System.out.println(0);
                        continue;
                    }

                    int Answer = 0;
                    int cc = 0;
                    int Counter = 0;

                    int Minimum = Math.min(A.length(), B.length());
                    int Maximum = Math.max(A.length(), B.length());

                    if (A.length() < B.length()) {
                        StringBuilder sb=new StringBuilder();
                        for (int i = 0; i < Maximum-Minimum; i++) {
                            sb.append('0');
                        }

                        sb.append(A);
                        A=sb.toString();
//                        System.out.println(sb);

                    } else{
                        StringBuilder sb=new StringBuilder();

                        for (int i = 0; i < Maximum-Minimum; i++) sb.append('0');

                        sb.append(B);

                        B=sb.toString();
//                        System.out.println(sb);
                    }

                    for (int i = A.length()-1; i >-1 ; i--) {
                        char characterOne='0';
                        char characterTwo='0';

                        characterTwo = B.charAt(i);
                        characterOne = A.charAt(i);

                        if (cc == 0 && characterTwo == '1' && characterOne == '1') {
                            cc = 1;
                            Counter=0;
                            Answer = Math.max(Answer, Counter);

                        } else if (cc == 1) {
                            if (characterTwo == '0' && characterOne == '0') {
                                cc = 0;
                                Counter++;
                                Answer = Math.max(Answer, Counter);
                                Counter = 0;
                            } else if ((characterTwo == '1' && characterOne == '0') || (characterTwo == '0' && characterOne == '1')) {
                                Counter++;
                                Answer = Math.max(Answer, Counter);
                            } else if (characterTwo == '1' && characterOne == '1') {
                                Counter++;
                                Answer = Math.max(Answer, Counter);
                                Counter = 0;

                            }
                        }
                    }
                    StringBuffer sb = new StringBuffer();
                    sb.append(Answer+1);
                    System.out.println(sb);
                }
            }
        }catch (Exception e){
            return;
        }
    }

    public static long add(BigInteger ADecimal, BigInteger BDecimal){
        long counter = 0;
        while(true){
            if(BDecimal.compareTo(zero)==0){
                break;
            }
            BigInteger U = ADecimal.xor(BDecimal);
            BigInteger V = ADecimal.and(BDecimal);
            ADecimal = U;
            BDecimal =  V.multiply(n);
            counter++;
        }
        return counter;
    }

    public static BigInteger toDecimal(String b) {
        return new BigInteger(b, 2);
    }

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

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}