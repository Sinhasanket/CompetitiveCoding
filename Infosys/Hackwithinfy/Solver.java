package Infosys.Hackwithinfy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solver {
 public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int w = sc.nextInt();
     int arr[]=new int[n];
     for (int i=0;i<n;i++)arr[i]=sc.nextInt();

     int low = 0,high = arr.length-1;
     int count=0;
     while (low<high){
         if (arr[high]==w){
             count++;
             high--;
         }
     }

   for (int i=0;i<high;i++){
       ArrayList<Integer> li = new ArrayList<>();
       li.clear();
       int sum = 0;
       boolean f = false;
       for (int j=i;j<high;j++){
           li.add(arr[i]);
           Collections.sort(li);
           if (li.size() > 2){
               sum = li.get(li.size()-2)+li.get(li.size()-1);
               if (sum <= w){
                   f = true;
                   count++;
               }
           }
           if (f) i = j;
       }
   }

     System.out.println(count);
 }
}

//5
//5
//5
//2
//1
//3
//4

