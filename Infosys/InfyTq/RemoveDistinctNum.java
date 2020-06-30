package Infosys.InfyTq;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RemoveDistinctNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int x = sc.nextInt();
        int arr[]=new int[len];
        for (int i=0;i<len;i++)arr[i]=sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<len;i++){
            if (!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else {
                int y = map.get(arr[i])+1;
                map.put(arr[i],y);
            }
        }
        int rmve = 0;
        for (Map.Entry mp : map.entrySet()){
            int k = (int) mp.getKey();
            int v = (int) mp.getValue();
            if (v == 1){
                if (rmve==x)break;
                map.put(k,-1);
                rmve++;
            }
        }

        int ans = 0;
        for (Map.Entry i : map.entrySet()){
            int v = (int) i.getValue();
            if (v != -1) ans++;
        }
        System.out.println(ans);
    }
}
//9
//3
//1 1 1 2 2 2 4 5 6

//2

//4
//2
//1 1 2 4

//1