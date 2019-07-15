package Google;

import java.util.Scanner;

public class Walk {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int test = sc.nextInt();
        int j=0;
        while(test-->0){
            j++;
            int N=sc.nextInt();
            int r=sc.nextInt();
            int c=sc.nextInt();
            int srow=sc.nextInt();
            int scol=sc.nextInt();
            String directions = sc.nextLine();
            sc.nextLine();
            for(int i=0;i<directions.length();i++){
                char s = directions.charAt(i);
                if(s =='E'){
                    scol++;
                }else if(s =='S'){
                    srow++;
                }else if(s =='W'){
                    scol--;

                }else if(s =='N'){
                    srow++;
                }

            }
            System.out.println("Case #"+j+" : "+srow+" "+scol);
        }
    }
}

// input
// 3
// 5 3 6 2 3
// EEWNS
// 4 3 3 1 1
// SESE
// 11 5 8 3 4
// NEESSWWNESE

// output
// Case # 1 : 2 3
// Case # 2 : 1 1
// Case # 3 : 3 4