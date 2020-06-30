package Practice;

import java.io.FileReader;
import java.util.Scanner;

public class Gandu {
    public static boolean isEven(int n){
        return (n%2==0)?true:false;
    }
    public static void main(String[] args){
        try{

            Scanner sc = new Scanner(new FileReader("//Users//sanketsinha//Desktop//JavaPrograms//Competitive//src//Practice//input.txt"));
            if(sc.hasNext()){
                int t = sc.nextInt();
                while(t-->0) {
                    int num = sc.nextInt();
                    int arr[] = new int[num];
                    Boolean flag = true;
                    arr[0]=sc.nextInt();
                    if(isEven(num)){
                        for (int i = 1; i < num; i++) {
                            if(i<=num/2){
                                arr[i]=sc.nextInt();
                                if(arr[i-1]!=arr[i] | arr[i-1]!=arr[i]+1){
                                    flag=false;
                                    break;
                                }
                            }else {
                                arr[i]=sc.nextInt();
                            }
                        }
                    }else {
                        for (int i = 1; i < num; i++) {
                            if(i<=(num/2)+1){
                                arr[i]=sc.nextInt();
                                if(arr[i-1]!=arr[i] | arr[i-1]!=arr[i]+1){
                                    flag=false;
                                    break;
                                }
                            }else {
                                arr[i]=sc.nextInt();
                            }
                        }
                    }

                    if(flag){
                        System.out.println("yes");
                    }else {
                        System.out.println("no");
                    }
                }
            }

        }catch (Exception e){
            return;
        }
    }
}
