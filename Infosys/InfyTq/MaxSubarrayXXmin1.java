package Infosys.InfyTq;

//An array is given suppose arr =3,5,8,2,19,12,7,13
//One have to find the largest sub array that the element satisfy the following
// condition x[i]=x[i-1]+x[i-2]
//If more than one sub array found then largest one has to be print.And if two sub arrays
// has same number of elements then we will print that sub array which will start first.
//Here Expected output is [3,5,8,13].
//Explanation :- 3rd element is 8 because sum of previous 2 elements ( 3 and 5), is 8 and 8
// is in the input array.
//Same like that 4th element will be the 13. because sum of previous 2 elements (8 and 5)
// ,is 13 and 13 is in the input array.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MaxSubarrayXXmin1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strArr[] = br.readLine().split(",");
        ArrayList<Integer> list = new ArrayList<>();
        for (String s : strArr)
            list.add(Integer.parseInt(s));
        ArrayList<Integer> longestSeries = new ArrayList<>();
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int first = list.get(i);
            int second = list.get(i + 1);
            ArrayList<Integer> fabList = new ArrayList<>();
            fabList.add(first);
            fabList.add(second);
            for (int j = i + 2; j < n; j++) {
                int ele = list.get(j);
                if (first + second == ele) {
                    fabList.add(ele);
                    first = second;
                    second = ele;
                }
            }
            if (longestSeries.size() < fabList.size())
                longestSeries = fabList;
        }
        if (longestSeries.size() > 2) {
            for (int ele : longestSeries) System.out.print(ele + " ");
        } else
            System.out.println("-1");
    }
}

//x[i]=x[i-1]+x[i-2]

//3,5,8,2,19,12,7,13
// [3,5,8,13].

