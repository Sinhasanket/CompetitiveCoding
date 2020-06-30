package Infosys.InfyTq;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class consecutivenumber {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int mat[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        //row
        String ye = "";
        for(int i=0;i<r;i++){
            ye = "";
            for(int j=0;j<c;j++){
                ye+=mat[i][j];
            }
            //  System.out.println(ye);
            checking(ye,ans);
            // ans.add(putting);
        }

        //col
        String vo = "";
        for(int i=0;i<c;i++){
            vo = "";
            for(int j=0;j<r;j++){
                vo+=mat[j][i];
            }
            // System.out.println(vo);
            checking(vo,ans);
            // ans.add(putting);
        }

        if(ans.size()==0) System.out.println(-1);
        else{
            Collections.sort(ans);
            // System.out.println(ans);
            System.out.println(ans.get(0));
        }
    }

    public static void checking(String check,ArrayList<Integer> li){
        // System.out.println(check.length());
        for(int i=0;i<check.length()-2;i++){
            if(check.charAt(i)==check.charAt(i+1) && check.charAt(i)==check.charAt(i+2)){
                li.add(Character.getNumericValue(check.charAt(i)));
            }
        }
    }
}
