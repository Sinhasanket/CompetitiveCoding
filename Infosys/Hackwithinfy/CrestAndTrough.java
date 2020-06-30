package Infosys.Hackwithinfy;

import java.util.Scanner;

public class CrestAndTrough{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long arr[]=new long[(int)n];
            for(int i=0;i<(int)n;i++)arr[i]=sc.nextLong();
            long maxCrest=Long.MIN_VALUE,minCrest=Long.MAX_VALUE,maxTrough=Long.MIN_VALUE,minTrough=Long.MAX_VALUE;
            long mC = -1,mxC=-1,mT=-1,mxcT=-1;
            for(int i=(int)n-2;i>=1;i--){
                if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                    long fw = Math.abs(arr[i]-arr[i+1]);
                    long bw = Math.abs(arr[i]-arr[i-1]);
                    if(fw > maxCrest){
                        maxCrest = fw;
                        mxC = i;
                    }
                    if(bw > maxCrest){
                        maxCrest = bw;
                        mxC = i;
                    }
                    if(fw <= minCrest){
                        minCrest = fw;
                        mC = i;
                    }
                    if(bw <= minCrest){
                        minCrest = bw;
                        mC = i;
                    }
                }
                if(arr[i] < arr[i-1] && arr[i] < arr[i+1]){
                    long fw = Math.abs(arr[i]-arr[i+1]);
                    long bw = Math.abs(arr[i]-arr[i-1]);
                    if(fw > maxTrough){
                        maxTrough = fw;
                        mxcT = i;
                    }
                    if(bw > maxTrough){
                        maxTrough = bw;
                        mxcT = i;
                    }
                    if(fw <= minTrough){
                        minTrough = fw;
                        mT = i;
                    }
                    if(bw <= minTrough){
                        minTrough = bw;
                        mT = i;
                    }
                }
            }

            if((mC != -1 && mxC != -1) && (mT != -1 && mxcT != -1)){
                long ans = Math.max(Math.abs(mC-mxC),Math.abs(mT-mxcT));
                System.out.println(ans);
            }else{
                System.out.println("-1");
            }
        }
    }
}