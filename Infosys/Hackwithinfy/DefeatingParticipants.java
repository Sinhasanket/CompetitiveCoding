package Infosys.Hackwithinfy;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DefeatingParticipants {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long e=sc.nextInt();
        int power[]=new int[n];
        int bonus[]=new int[n];
        for (int i=0;i<n;i++)power[i]=sc.nextInt();
        for (int i=0;i<n;i++)bonus[i]=sc.nextInt();
        TreeMap<Integer,Integer> tree = new TreeMap<>();
        for (int i=0;i<n;i++){
            if (!tree.containsKey(power[i])){
                tree.put(power[i],bonus[i]);
            }else {
                int newBonus = tree.get(power[i])+bonus[i];
                tree.put(power[i],newBonus);
            }
        }
        int count=0;
        for (Map.Entry loo : tree.entrySet()){
            int key = (int) loo.getKey();
            int val = (int) loo.getValue();
            if (key < e){
                e+=val;
                count++;
            }
        }
        System.out.println(count);
    }
}

//input
//2
//123
//78
//130
//10
//0

//output
//2