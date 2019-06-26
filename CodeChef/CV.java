package Codechef;

import java.util.Scanner;
public class CV
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
            int test = sc.nextInt();
            if(test<=100){
                while(test-->0){
                    int N = sc.nextInt();
                    sc.nextLine();
                    if(N<=100){
                        String letters = sc.nextLine();
                        if (letters.length() > N) {
                            letters = letters.substring(0, N);
                        }
                        char c[] = new char[N];
                        for(int j=0;j<letters.length();j++){
                            c[j] = letters.charAt(j);
                        }
                        int counter=0;
                        for(int i=0;i<N-1;i++){
                            if(c[i]!='a' && c[i]!='e' && c[i]!='i' && c[i] !='o' && c[i]!= 'u'){
                                if(c[i+1] == 'a' || c[i+1] == 'e' || c[i+1] == 'i' || c[i+1] == 'o' || c[i+1] == 'u' ){
                                    counter++;
                                }
                            }
                        }
                        System.out.println(counter);
                    }

                }
            }
        }

    }
}

//       input
//        3
//        6
//        bazeci
//        3
//        abu
//        1
//        o
//       output
//         3
//         1
//         0
