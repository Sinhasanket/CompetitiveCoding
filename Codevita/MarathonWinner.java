package Codevita;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//AC

public class MarathonWinner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int mat[][] = new int[n][m+1];
        for (int i=0;i<n;i++){
            for (int j=0;j<m+1;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i=0;i<n;i++){
            int sum = 0;
            for (int j=0;j<m;j++){
                sum += (mat[i][j]*mat[i][m]);
                mat[i][j] = sum;
            }
        }

        HashMap<Integer,Integer> win = new HashMap<>();
        for (int i=1;i<=n;i++){
            win.put(i,0);
        }
       // System.out.println(win);
        int max = Integer.MIN_VALUE;
        for (int j=1;j<m-1;j+=2){
            int x = 1;
              for (int i=0;i<n;i++){
                  if (mat[i][j] > max){
                      max = mat[i][j];
                      x = i+1;
                  }
            }
            int c = win.get(x)+1;
              win.put(x,c);
        }
//        System.out.println(win);
        int ans = 0;
        max = Integer.MIN_VALUE;
        for (Map.Entry check : win.entrySet()){
            int key = (int) check.getKey();
            int value = (int) check.getValue();
            if (value > max){
                ans = key;
                max = value;
//                System.out.println(key);
            }
        }
        System.out.print(ans);
    }
}
