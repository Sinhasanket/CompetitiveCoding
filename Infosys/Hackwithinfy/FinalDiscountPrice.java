package Infosys.Hackwithinfy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FinalDiscountPrice {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int  n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i=0;i<n;i++){
                arr.add(sc.nextInt());
            }
            int ans = 0;
            for (int i=0;i<n-1;i++){
                boolean ok = true;
                for (int j=i+1;j<n;j++){
                    if (arr.get(j) > arr.get(i)){
                        continue;
                    }
                    if (arr.get(j) <= arr.get(i)){
                        ok=false;
                        ans += (arr.get(i)-arr.get(j));
                        break;
                    }
                }
                if (ok){
                    ans+=arr.get(i);
                }
            }
            ans+=arr.get(arr.size()-1);
            System.out.println(ans);
        }
    }
}