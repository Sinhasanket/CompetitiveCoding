package Codevita;

import java.io.*;
import java.util.ArrayList;

public class DigitPairs {

    static class FastReader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public FastReader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            }  while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException {
            if (din == null)
                return;
            din.close();
        }
    }

    public static void main(String[] args) {

        try{
            FastReader input = new FastReader();
            ArrayList<Integer> list = new ArrayList<>();

            int num = input.nextInt();
            int count=0;
            for(int i=0;i<num;i++) list.add(input.nextInt());

            ArrayList<Integer> ans = new ArrayList<>();
            for(int i=0;i<num;i++) {
                int max=Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
                int sum;
                int getNum = list.get(i);
                for(int j=0;j<3;j++) {
                    int digit = getNum%10;
                    if(digit>max) {
                        max = digit;
                    }
                    if(digit<min) {
                        min = digit;
                    }
                    getNum = getNum/10;
                }
                sum = min*7+max*11;
                if(sum>99) {
                    sum = sum%100;
                }
                ans.add(sum);
            }

            for(int i=0;i<num;i++) {
                int ele = ans.get(i);
                for(int p=i+1;p<num;p+=2) {
                    if(ele/10 == ans.get(p)/10)
                        count++;
                }
            }
            StringBuffer sb = new StringBuffer();
            sb.append(count);
            System.out.println(count);

            input.close();
        }catch (Exception e){
            return;
        }
    }
}

//input
//8 234 567 321 345 123 110 767 111
//output
//3