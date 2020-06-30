package Infosys;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        System.out.println(solve(st));
    }

    static final int MAX = 256;
    public static int solve(String str){
        int n = str.length();
        int disc = 0;

        boolean[] vis = new boolean[MAX];
        Arrays.fill(vis, false);
        for (int i=0; i<n; i++) {
            if (vis[str.charAt(i)] == false) {
                vis[str.charAt(i)] = true;
                disc++;
            }
        }

        int st = 0, sind = -1;
        int minlen = Integer.MAX_VALUE;

        int count = 0;
        int[] curr =  new int[MAX];
        for (int j=0; j<n; j++) {
            curr[str.charAt(j)]++;

            if (curr[str.charAt(j)] == 1 )
                count++;

            if (count == disc) {
                while (curr[str.charAt(st)] > 1) {
                    if (curr[str.charAt(st)] > 1) curr[str.charAt(st)]--;
                    st++;
                }

                int lenw = j - st + 1;
                if (minlen > lenw) {
                    minlen = lenw;
                    sind = st;
                }
            }
        }
        return str.substring(sind, sind+minlen).length();
    }
}
