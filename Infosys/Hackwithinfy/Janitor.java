package Infosys.Hackwithinfy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Janitor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Double> arr = new ArrayList<>();
        for (int i=0;i<n;i++){
            arr.add(sc.nextDouble());
        }
        Collections.sort(arr);
        int count=0;
        int l=0,r=n-1;
        while(l<=r){
            if(arr.get(l) + arr.get(r) <= 3.0){
                count++;
                l++;r--;
            }else if(arr.get(r) <= 3.0){
                count++;
                r--;
            }else if(arr.get(l) <= 3.0){
                l++;
                count++;
            }
        }
        System.out.println(count);
    }
}
