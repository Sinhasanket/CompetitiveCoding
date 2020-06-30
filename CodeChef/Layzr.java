package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Layzr {
    public static void main(String[] args){
        FastReader f = new FastReader();
        int t = f.nextInt();
        StringBuffer ans = new StringBuffer();
        while(t-->0){
            long n = f.nextInt();
            long q = f.nextInt();
            long arr[]=new long[(int)(n+n)];
            long z = 1;
            for (int i=0;i<arr.length-1;i+=2){
                arr[i] = z++;
                arr[i+1]=f.nextLong();

            }
            while (q-->0){
                long x1=f.nextLong();
                long x2 = f.nextLong();
                long y = f.nextLong();
                int count=0;
                boolean flag = false;
                ArrayList<Long> previous = new ArrayList<>();
                previous.clear();
                for (int i=0;i<arr.length-2;i+=2){
                    Point p1 = new Point(arr[i],arr[i+1]);
                    Point q1 = new Point(arr[i+2],arr[i+3]);
                    Point p2 = new Point(x1,y);
                    Point q2 = new Point(x2,y);
                    previous.add(arr[i+2]);
                    previous.add(arr[i+3]);

                    if (i > 0 && arr[i]==x2 && arr[i+1]==y && previous.get(0)==x2 && previous.get(1)==y){
                        flag=true;
                        previous.clear();
                    }
                    Point intersection = lineLineIntersection(p1, q1, p2, q2);
                    if (intersection.x == Long.MAX_VALUE && intersection.y == Long.MAX_VALUE) {
                        continue;
                    } else {
                        count++;
                    }
                }
                ans.append((flag) ? count-2 : count-1).append("\n");
            }
        }
        System.out.print(ans);
    }

    static class Point {
        long x;
        long y;
        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    };

    static Point lineLineIntersection(Point A, Point B, Point C, Point D) {
        long a1 = B.y - A.y;
        long b1 = A.x - B.x;
        long c1 = a1*(A.x) + b1*(A.y);
        long a2 = D.y - C.y;
        long b2 = C.x - D.x;
        long c2 = a2*(C.x)+ b2*(C.y);

        long determinant = a1*b2 - a2*b1;

        if (determinant == 0) {
            return new Point(Long.MAX_VALUE, Long.MAX_VALUE);
        } else {
            long x = (b2*c1 - b1*c2)/determinant;
            long y = (a1*c2 - a2*c1)/determinant;
            return new Point(x, y);
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