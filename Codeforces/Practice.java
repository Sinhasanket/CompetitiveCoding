package Codeforces;

import java.io.IOException;
import java.util.Scanner;

public class Practice {
    static int MOD = 1000000007;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        boolean flag = true;
        for (int i=0;i<st.length()-2;i++){
            if (st.charAt(i)=='A' && st.charAt(i+1)=='B'){
                for (int j=i+1;j<st.length();j++){
                    if (st.charAt(j)=='B' && st.charAt(j+1)=='A'){
                        System.out.println("YES");
                        flag = false;
                        break;
                    }
                }
            }else if (st.charAt(i)=='B' && st.charAt(i+1)=='A'){
                for (int j=i+1;j<st.length();j++){
                    if (st.charAt(j)=='A' && st.charAt(j+1)=='B'){
                        System.out.println("YES");
                        flag = false;
                        break;
                    }
                }
            }
            if(!flag)break;
        }
        if (flag) System.out.println("NO");
    }
}