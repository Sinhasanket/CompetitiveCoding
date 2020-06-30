package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Theater {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    public static void main(String[] args){
        try{
            FastReader f = new FastReader();
            int t = f.nextInt();
            int fAns = 0;
            while(t-->0) {
               int n = f.nextInt();

               int mat[][]=new int[4][4];

               while(n-->0){
                   char mov = f.next().charAt(0);
                   int num = f.nextInt();
                   switch (mov){
                       case 'A':
                          // System.out.println("enter A");
                           if (num==12){
                             mat[0][0] +=1;
                           }else if (num==3){
                             mat[0][1] +=1;
                           }else if(num==6){
                              mat[0][2] +=1;
                           }else {
                            mat[0][3] +=1;
                           }
                           break;
                       case 'B':
                           //System.out.println("enter B");
                           if (num==12){
                            mat[1][0] +=1;
                           }else if (num==3){
                             mat[1][1] +=1;
                           }else if(num==6){
                               mat[1][2] +=1;
                           }else {
                            mat[1][3] +=1;
                           }
                           break;
                       case 'C':
                          // System.out.println("enter C");
                           if (num==12){
                               mat[2][0] +=1;
                           }else if (num==3){
                              mat[2][1] +=1;
                           }else if(num==6){
                               mat[2][2] +=1;
                           }else {
                              mat[2][3] +=1;
                           }
                           break;
                       case 'D':
                          // System.out.println("enter D");
                           if (num==12){
                               mat[3][0] +=1;
                           }else if (num==3){
                               mat[3][1] +=1;
                           }else if(num==6){
                               mat[3][2] +=1;
                           }else {
                               mat[3][3] +=1;
                           }
                           break;
                   }
               }

//               for (int i=0;i<4;i++){
//                   for (int j=0;j<4;j++){
//                       System.out.print(mat[i][j]+" ");
//                   }
//                   System.out.println();
//               }
                int sum=-100000;
                for (int i=0;i<4;i++){
                    for (int j=0;j<4;j++){
                        if (j==i) continue;
                        for (int k=0;k<4;k++){
                            if (k==j || k==i) continue;
                            for (int l=0;l<4;l++){
                                if (l==k || l==i || l==j) continue;

                                int temp[] = {mat[0][i] , mat[1][j],mat[2][k],mat[3][l]};
                                Arrays.sort(temp);
                                int ans = 25*temp[0]+50*temp[1]+75*temp[2]+100*temp[3];
                                if (mat[0][i]==0) ans-=100;
                                if (mat[1][j]==0) ans-=100;
                                if (mat[2][k]==0) ans-=100;
                                if (mat[3][l]==0) ans-=100;
                                if (ans>sum) sum=ans;
                            }
                        }
                    }
                }

                System.out.println(sum);
                fAns+=sum;

                }
            System.out.println(fAns);
        }catch (Exception e){
            return;
        }
    }
}