package Codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class Check {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            ArrayList<ArrayList<Integer>>  adj = new ArrayList<>(n+1);
            for (int i=1;i<n+1;i++){
                adj.add(new ArrayList<>());
            }

            while (m-->0){
                int u = sc.nextInt();
                int v = sc.nextInt();
                int cost = sc.nextInt();
                adj.get(u).add(v);
                adj.get(u).add(cost);
            }

            int ans = 0;
            for (int i=1;i<adj.size();i++){
                int check = Integer.MIN_VALUE;
                for (int j=1;j<adj.get(i).size();j+=2){
                    check = Math.max(check,adj.get(i).get(j));
                }
                ans+=check;
            }

            System.out.println(ans);
        }
    }
}
