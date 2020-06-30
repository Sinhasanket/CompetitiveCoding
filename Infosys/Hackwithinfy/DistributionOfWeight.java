package Infosys.Hackwithinfy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class DistributionOfWeight {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            String ss[] = s.split(" ");
            int n = Integer.parseInt(ss[0]);
            int m = Integer.parseInt(ss[1]);
            String nums = br.readLine();
            String[] nn = nums.split(" ");
            int arr[] = new int[n];
            int max = 0;
            int min = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(nn[i]);
                max+=arr[i];
                min = Math.max(min,arr[i]);
            }
           // System.out.println(max+" "+min);
            int low = min,high=max;
            ArrayList<Integer> ans = new ArrayList<>();
            int mid = (low+high)/2;
            while (low<=high){
                if (isPossible(arr,m,mid)){
                    ans.add(mid);
                    high=mid-1;
                }else {
                    low=mid+1;
                }
                mid = (low+high)/2;
            }
            Collections.sort(ans);
            System.out.println(ans.get(0));
        }
    }

    public static boolean isPossible(int arr[],int m ,int k){
        int cuur_sum=arr[0];
        int subarr=1;
        boolean flag = true;
        for (int i=1;i<arr.length;i++){
            if (arr[i]+cuur_sum > k){
                cuur_sum=arr[i];
                subarr++;
            }else {
                cuur_sum+=arr[i];
            }
            if (subarr>m){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
