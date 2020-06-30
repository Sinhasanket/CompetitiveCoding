package Infosys.InfyTq;

//Given an array of integers, find the combination of integers forming a sequence which satisfies
// the below conditions:
//
//The ith  integer must satisfy the given equation in the sequence
//(1)   X[i] = X[i-1] + X[i-2]
//
//(2) The length of the sequence must be maximum possible
//(3)  If there is more than one sequence satisfying above two conditions then print that
//      sequence which contains least integers.
//      In case there is no combination of integers possible then print -1.
//See the example below:
//   Example 1:
//     If the given integers are 4,2,7,5,3,8,10,11,19 then the possible combinations of
//     integers satisfying above conditions are 4,7,11 and 5 3 8 11 19  and hence the output
//     must be 5 3 8 11 19. Here you cannot form any other combination of integers whose length is
//     greater than 4 and satisfies the given equation.
//   Example 2:
//     If the given integers are 1,5,6,10 then print -1.

import java.util.ArrayList;
import java.util.Scanner;

public class LongestXlist {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.replaceAll("[^a-zA-Z0-9]"," ");
        String numbers[] = str.split(" ");
        int arr[] = new int[numbers.length];
        for (int i=0;i<numbers.length;i++){
            arr[i] = Integer.parseInt(numbers[i]);
        }
        int len = arr.length;
        ArrayList<Integer> total = new ArrayList<>();
        for (int i=0;i<len;i++){
            for (int j=i+1;j<len;j++){
                ArrayList<Integer> fibo = new ArrayList<>();
                int first = arr[i];
                int second = arr[j];
                fibo.add(first);
                fibo.add(second);
                for (int k=j+1;k<len;k++){
                   if (first+second==arr[k]){
                       fibo.add(arr[k]);
                       first=second;
                       second=arr[k];
                   }
                }
                if (total.size() < fibo.size()){
                    total.clear();
                    for (int z=0;z<fibo.size();z++)total.add(fibo.get(z));
                }
            }
        }

        if (total.size() > 2){
            for (Integer ans : total){
                System.out.print(ans+" ");
            }
        }else {
            System.out.println("-1");
        }
    }
}
//4,2,7,5,3,8,10,11,19
//5 3 8 11 19