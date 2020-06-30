package Infosys.Hackwithinfy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NmaxPair {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for(int i=0;i<t;i++)a.add(sc.nextInt());
        for(int i=0;i<t;i++)b.add(sc.nextInt());
        ArrayList<Integer> ans = solve(a,b);
        System.out.println(ans);
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> a,ArrayList<Integer> b ){
        ArrayList<Integer> find = new ArrayList<>();
        int n = a.size();
        if(n==1){
            find.add(a.get(0)+b.get(0));
            return find;
        }
        Collections.sort(a);Collections.sort(b);
        Collections.reverse(a);Collections.reverse(b);
        int half = n/2;
        int z =0;
        boolean f = true;
        for (int i=0;i<half;i++){
           for (int j=0;j<half;j++){
               int c  = a.get(i)+b.get(j);
               if (z==n){
                   f=false;
                   break;
               }else{
                   find.add(c);
               }
               z++;
           }
           if (!f)break;
        }
        Collections.sort(find);
        Collections.reverse(find);
        return find;
    }
}
