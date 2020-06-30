package Codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class Icm {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            ArrayList<String> str = new ArrayList<>();
            for(int i = 1; sc.hasNext()== true; i++){
                str.add(sc.nextLine());
            }



//            int ii=0;
//            while (sc.hasNextInt()) {
//                String ss = sc.next();
//             //   System.out.println(ss);
//               // str.add(ss);
//                System.out.println(ii);
//                ii++;
//            }
            System.out.println(str);
            for (int i=0;i<str.size()-1;i+=2){
                String a = str.get(i);
                String b = str.get(i+1);
                System.out.println(solve(a,b));
            }
        } catch (Exception e) {
            return;
        }
    }

    public static int solve(String s1,String s2){
        int n = s1.length();
        int m = s2.length();
        int dp[][]=new int[n+1][m+1];
        for (int i=n-1;i>=0;i--){
            for (int j=m-1;j>=0;j--){
                if (i==n || j==m){
                    dp[i][j] = 0;
                    continue;
                }
                if (s1.charAt(i)==s2.charAt(j)){
                    dp[i][j] = 1+dp[i+1][j+1];
                }else {
                    dp[i][j] = Math.max(dp[i+1][j],dp[i][j+1]);
                }
            }
        }
        return dp[0][0];
    }
}
