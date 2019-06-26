package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChefandProxy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        if(t>=0 && t<=200){
            while(t-->0){
                int len = Integer.parseInt(br.readLine());
                if(len>=0 && len <=1000){
                    String str = br.readLine();
                    char strr[] = str.toCharArray();
                    int cntP=0;
                    for(int i=0;i<strr.length;i++){
                        if(strr[i]=='P'){
                            cntP++;
                        }
                    }
                    int cnt = 0;
                    if( checkPercentage(cntP,len) < 75){
                        for(int i=2;i<=strr.length-3;i++){
                                if((strr[i-1]=='P' || strr[i-2]=='P') && (strr[i+1]=='P' || strr[i+2]=='P')){
                                    if(strr[i]=='A'){
                                        cntP++;
                                        cnt++;
                                        if(checkPercentage(cntP,len) >= 75){
                                            break;
                                        }

                                    }
                                }
                        }
                    }
                    if(cnt>=0 && checkPercentage(cntP,len) <75 ){
                        System.out.println(-1);
                    }else{
                        System.out.println(cnt);
                    }
                }

            }
        }

    }

    public static int checkPercentage(int p,int len){
        int result = (p*100)/len;
        return result;
    }
}

//input
//1
//9
// PAAPPAPPP

//output
//1