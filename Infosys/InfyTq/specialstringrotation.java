package Infosys.InfyTq;

import java.util.ArrayList;
import java.util.Scanner;

//Every string is associated with the number separated by colon(:).
// Task is to rotate the string based on the number. If the sum of square of digits
// is even then rotate the string right by 1 position else rotate the string left by 2
// position.

public class specialstringrotation {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        if (st.isEmpty()){
            System.out.println("");
            System.exit(0);
        }
        String seprate[] = st.split(",");
        ArrayList<Integer> nbr= new ArrayList<>();nbr.clear();
        ArrayList<String> strr= new ArrayList<>();strr.clear();
        for(int i=0;i<seprate.length;i++){
            String gc[] = seprate[i].split(":");
            strr.add(gc[0]);
            nbr.add(Integer.parseInt(gc[1]));
        }

        for(int i=0;i<nbr.size();i++){
            int eo = calc(nbr.get(i));
            String str = strr.get(i);
            if(eo%2==0){
                System.out.print(rightRot(str,1)+" ");
            }else{
                System.out.print(leftRot(str,2)+" ");
            }
        }
    }

    public static int calc(int num){
        int check = 0;
        while(num != 0){
            int d = num%10;
            check += d*d;
            num = num/10;
        }
        return check;
    }

    static String leftRot(String str, int d) {
        String ans = str.substring(d) + str.substring(0, d);
        return ans;
    }

    static String rightRot(String str, int d) {
        return leftRot(str, str.length() - d);
    }
}

//rhdt:246,ghftd:1246
//trhd ftdgh

//abcd:1234,bcdgfhf:127836,sdjks:1245
//dabc dgfhfbc ssdjk

