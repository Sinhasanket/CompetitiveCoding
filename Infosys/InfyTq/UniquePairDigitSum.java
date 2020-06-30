package Infosys.InfyTq;

import java.util.Arrays;
import java.util.Scanner;

public class UniquePairDigitSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.replaceAll("[^A-Za-z0-9]"," ");
        String[] nums = str.split(" ");
        int arr[]=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            arr[i] = Integer.parseInt(nums[i]);
            arr[i] = sumOFDigit(arr[i]);
        }
        Arrays.sort(arr);
        int counter=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j])counter++;
            }
        }
        System.out.println(counter == 0 ? -1 : counter);
    }

    public static int sumOFDigit(int n){
        int res=0;
        while (n>0){
            res += (n%10);
            n/=10;
        }
        return res;
    }
}


//34,89,6,321,53,45,2211,81
//4

//564,65,76,43,123,44
//-1