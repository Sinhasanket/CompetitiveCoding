package Infosys.Hackwithinfy;

import java.util.Scanner;

public class increasingseq {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++)arr[i]=sc.nextInt();
        String st = "";
        String max = "";
        for (int i=0;i<n;i++){
            int j = i;
            if(j+1 < n && arr[i+1] >= arr[i]){
               // System.out.print(arr[i]+" ");
                st+=arr[i]+" ";
            }else {
                //System.out.print(arr[i]+" ");
                st+=arr[i];
                if (st.length() > max.length()){
                    max  = new String(st);
                    st="";
                }
            }
        }
        System.out.println(max);
    }
}
