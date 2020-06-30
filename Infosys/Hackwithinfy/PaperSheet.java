package Infosys.Hackwithinfy;

import java.util.Scanner;

public class PaperSheet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int h1 = sc.nextInt();
        int w1 = sc.nextInt();

        int hDiff = h-h1;
        int wDiff = w-w1;

        int hmid = h/2;
        int wmid = w/2;

        int count=0;

        if (hDiff >0){
            count+=hDiff/hmid;
            if (hDiff%hmid != 0){
                count+=1;
            }
        }
        if (wDiff >0 ){
            count+=wDiff/wmid;
            if (wDiff%wmid != 0){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
