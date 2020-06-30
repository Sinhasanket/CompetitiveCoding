package Infosys.Hackwithinfy;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UniqueEle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            ArrayDeque<Long> dq = new ArrayDeque<>();
            dq.clear();
            for (int i=0;i<n;i++){
                dq.add(sc.nextLong());
            }
            long move = 1;
            long ans = 0;

            ArrayList<Long> temp = new ArrayList<>(dq);

            while (true){
                if (dq.size()==0)break;
                else {
                    long first = dq.peekFirst();
                    long last = dq.peekLast();
                    if (first < last){
                        ans += (dq.removeFirst()*move)+ Collections.max(temp);
                        temp.clear();
                        temp = new ArrayList<>(dq);
                        move++;
                        System.out.println(dq);

                    }else {
                        ans+=(dq.removeLast()*move)+Collections.max(temp);
                        temp.clear();
                        temp = new ArrayList<>(dq);
                        move++;
                        System.out.println(dq);
                    }
                }
            }
            System.out.println(ans);
            temp.clear();
        }
    }
}

//1
//5
//5 4 3 6 2
//96