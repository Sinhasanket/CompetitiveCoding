package Infosys.InfyTq;

import java.util.ArrayList;
import java.util.Scanner;

//Length of combination should be 4

public class CombinationOfSumEqualsGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int sum = sc.nextInt();
        str = str.replaceAll(",", " ");
        String nums[] = str.split(" ");
        int arr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = Integer.parseInt(nums[i]);
        }
        int n = nums.length;
        int combination = 0;
        for (int i = 0; i < (1 << n); i++) {
            ArrayList<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0)
                    subset.add(arr[j]);
            }
            int size = subset.size();
            if (size == 0)
                continue;
            else if (size == 4) {
                int temp = subset.get(0);
                for (int x = 1; x < size; x++)
                    temp += subset.get(x);
                if (temp == sum)
                    combination++;
            }
        }
        System.out.println(combination);
    }
}
