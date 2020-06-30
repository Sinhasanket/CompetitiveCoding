package Codevita;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CollisionCourse {
    static int MOD=1000000007;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        HashMap<Float,Long> pairs = new HashMap<>();
        while (t-->0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long speed = sc.nextLong();
            float timeTaken =(float) Math.sqrt(Math.pow((x/speed),2)+Math.pow((y/speed),2));
            if (!pairs.containsKey(timeTaken)) {
                pairs.put(timeTaken, 1L);
            } else {
                long increse = pairs.get(timeTaken) + 1;
                pairs.put(timeTaken, increse);
            }
        }
//        System.out.println(pairs);
        long ans = 0;
        for (Map.Entry k : pairs.entrySet()){
            long val = (long) k.getValue();
            ans += (val * (val-1))/2;
        }
        System.out.println(ans);
    }
}
