package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//Find the divisors of target Value, just have to add the source element until it reaches upto it any
//of the divisors ex:- src=3, target = 8(1,2,4,8)<=Divisor so add 1 to src it becomes 4 and 4 is divisor of 8

public class TTUPLE {
    int mod = 1000000007;

    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-->0){
            long p = sc.nextLong();
            long q = sc.nextLong();
            long r = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long differenceA = p-a;
            long differenceB = q-b;
            long differenceC = r-c;
            if(a!=0 && b!=0 && c!=0){
                if((differenceA-differenceB==0)&&(differenceB-differenceC==0)&&(differenceC-differenceA==0)){
                    if(differenceA==0) System.out.println("0");
                    else System.out.println("1");

                }
                else if((differenceA-differenceB==0)||(differenceB-differenceC==0)||(differenceC-differenceA==0)){
                    if((differenceA==0)||(differenceC==0)||(differenceB==0)) System.out.println("1");
                    else System.out.println("2");
                }
                else if(differenceA==differenceC+differenceB||differenceB==differenceA+differenceC||differenceC==differenceB+differenceA)
                    System.out.println("2");
                else if((p/a==q/b)&&(q/b==r/c)&&(r/c==p/a) &&(p%a==0)&&(q%b==0)&&(r%c==0)) System.out.println("1");
                else if(((p/a==q/b)&&(p%a==0)&&(q%b==0))||((q/b==r/c)&&(q%b==0)&&(r%c==0))||((r/c==p/a)&&(p%a==0)&&(r%c==0))){
                    if(differenceA==0 || differenceB==0 || differenceC==0) System.out.println("1");
                    else System.out.println("2");
                }
                else if(p%a==q%b&&q%b==r%c&&p%a==r%c) System.out.println("2");
                else System.out.println("3");
            }
            else{
                if((differenceA-differenceB==0)&&(differenceB-differenceC==0)&&(differenceC-differenceA==0)){
                    if(differenceA==0) System.out.println("0");
                    else System.out.println("1");

                }
                else if((differenceA-differenceB==0)||(differenceB-differenceC==0)||(differenceC-differenceA==0)){
                    if((differenceA==0)||(differenceC==0)||(differenceB==0)) System.out.println("1");
                    else System.out.println("2");
                }
                else if(differenceA==differenceC+differenceB||differenceB==differenceA+differenceC||differenceC==differenceB+differenceA)
                    System.out.println("2");
                else if(a==0&&b==0&&c==0) System.out.println("3");
                else if((a==0&&b==0)||(a==0&&c==0)||(c==0&&b==0)) System.out.println("1");
                else if(a==0||b==0||c==0){
                    if(a==0){
                        if(q/b==r/c) System.out.println("1");
                        else if(b==1||c==1||b== -1||c==-1) System.out.println("2");
                        else if(q%b==r%c) System.out.println("2");
                        else System.out.println("3");
                    }
                    else if(b==0){
                        if(p/a==r/c) System.out.println("1");
                        else if(a==1||c==1||a==-1||c==-1) System.out.println("2");
                        else if(p%a==r%c) System.out.println("2");
                        else System.out.println("3");
                    }
                    else if(c==0){
                        if(p/a==q/b) System.out.println("1");
                        else if(b==1||a==1||b==-1||a==-1) System.out.println("2");
                        else if(p%a==q%b) System.out.println("2");
                        else System.out.println("3");
                    }
                }

                else System.out.println("3");
            }
        }
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

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}

//        Input:
//        12
//        3 5 7
//        6 5 10
//        8 6 3
//        9 7 8
//        1 2 3
//        5 10 15
//        1 2 3
//        5 8 15
//        1 2 3
//        9 10 15
//        2 5 9
//        18 45 81
//        2 5 9
//        9 12 16
//        3 6 7
//        3 6 7
//        3 6 7
//        5 9 7
//        3 6 7
//        5 8 7
//        3 6 9
//        6 10 10
//        3 5 6
//        6 30 18
//
//        Output:
//        1
//        2
//        1
//        2
//        2
//        1
//        1
//        0
//        2
//        1
//        2
//        2



