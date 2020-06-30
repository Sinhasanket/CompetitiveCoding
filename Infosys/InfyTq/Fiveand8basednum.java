package Infosys.InfyTq;

import java.util.Scanner;

public class Fiveand8basednum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.replaceAll("[^a-zA-Z0-9]"," ");
        String arr[] = s.split(" ");
        int intarr[]=new int[arr.length];
        for (int i=0;i<arr.length;i++)intarr[i] = Integer.parseInt(arr[i]);
        int ind5 = -1;
        int ind8 = -1;
//        for (int i=0;i<intarr.length;i++){
//            if (intarr[i]==5)ind5=i;
//            if (intarr[i]==8)ind8=i;
//        }
        for (int i=0;i<intarr.length;i++){
            if (intarr[i]==5){
                ind5=i;
                break;
            }
        }
        for (int i=0;i<intarr.length;i++){
            if (intarr[i]==8){
                ind8=i;
                break;
            }
        }
        String numString2 = "";
        for (int i=ind5;i<=ind8;i++){
            numString2+=intarr[i];
        }
        int num1 = 0;
        for (int i=0;i<ind5;i++){
            num1+= intarr[i];
        }
        for (int i=ind8+1;i<intarr.length;i++){
            num1+= intarr[i];
        }

        int num2 = Integer.parseInt(numString2);
        System.out.println(num1+num2);

    }
}

//3,2,6,5,1,4,8,9
//5168


//
//inp_string=input()
//        all_num=[]
//        all_num = inp_string.split(",")
//        num_strt5 = all_num.index('5')
//        num_strt8 = all_num.index('8')
//
//        num1_list = all_num[0:num_strt5]
//        num1_list.extend(all_num[num_strt8+1:])
//        # print(num1_list)
//        num1_sum=0
//        for ele in num1_list:
//        num1_sum += int(ele)
//        num2_lst = all_num[num_strt5:num_strt8+1]
//
//        num2_sum=""
//        for ele in num2_lst:
//        num2_sum+=ele
//        print(int(num2_sum)+num1_sum)
