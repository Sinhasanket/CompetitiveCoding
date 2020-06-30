package Codevita;

import java.util.Scanner;

public class AtmMachine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int withdraw = sc.nextInt();
        int hundered = sc.nextInt();
        int twohundered = sc.nextInt();
        int fivehundered = sc.nextInt();
        int thousand = sc.nextInt();
        int count=0;
        int sum = 0,sum2=0,sum1=0,sum3=0;
        for(int i = 0; i <= hundered; i++) {
            sum= i*100;
            if(sum == withdraw && i<=n && i>count)
                count = i;
            if(sum < withdraw)
                for(int j = 0; j<=twohundered; j++) {
                    sum1=sum+j*200;
                    if(sum1 == withdraw && (i+j) <= n && (j+i)>count)
                        count= i + j;
                    if(sum1 < withdraw)
                        for(int k = 0; k<=fivehundered; k++) {
                            sum2= sum1 + k*500;
                            if(sum2 == withdraw && (i+j+k)<=n && (i+j+k)>count)
                                count= i + j + k;
                            if(sum2 < withdraw)
                                for(int l = 0; l<=thousand; l++) {
                                    sum3= sum2+ l*1000;
                                    if(sum3 == withdraw && (i+j+k+l)<=n && (i+j+k+l)>count)
                                        count= i + j + k + l;
                                    if(sum3 > withdraw)
                                        l= thousand + 1;
                                }
                        }
                }
        }
        System.out.println(count);
    }
}
