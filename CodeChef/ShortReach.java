package Codechef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class ShortReach {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(n+1);
            for (int i=0;i<n+1;i++){
                adj.add(new ArrayList<Integer>());
            }
            while(m-->0){
                int u = sc.nextInt()-1;
                int v = sc.nextInt()-1;
                adj.get(u).add(v);
                adj.get(v).add(u);
            }

            int source = sc.nextInt()-1;

            int dist[]=new int[n];
            Arrays.fill(dist,-1);
            boolean visited[]=new boolean[n];
            LinkedList<Integer> queue = new LinkedList<>();
            dist[source]=0;
            visited[source]=true;
            queue.addLast(source);
            while (!queue.isEmpty()){
                source = queue.removeFirst();
              //  System.out.println("source :"+source);
                for (Integer du : adj.get(source)){
                    if (visited[du]==false && dist[du]==-1){
                        visited[du]=true;
                        queue.addLast(du);
                        dist[du] = dist[source]+1;
                    }
                }
            }

            for (int i=0;i<dist.length;i++){
                if (dist[i] == -1)
                System.out.print(dist[i]+" ");
                else if (dist[i] != 0) System.out.print((dist[i]*6)+" ");
            }
            System.out.println();
        }
    }
}

//2
//4 2
//1 2
//1 3
//1
//3 1
//2 3
//2

//6 6 -1
//-1 6