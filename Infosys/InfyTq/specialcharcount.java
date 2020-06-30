package Infosys.InfyTq;

import java.util.ArrayList;
import java.util.Scanner;

//Count special character and print digit in even odd manner

public class specialcharcount {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        String num ="";
        String spl ="";
        for(int i=0;i<st.length();i++){
            if(Character.isAlphabetic(st.charAt(i))){
                continue;
            }else if(Character.isDigit(st.charAt(i))){
                num += st.charAt(i);
            }else{
                spl+=st.charAt(i);
            }
        }
        //  System.out.println(num);
        //System.out.println(spl);
        ArrayList<Integer> odd = new ArrayList();
        ArrayList<Integer> even = new ArrayList();
        for(int i=0;i<num.length();i++){
            int n = Character.getNumericValue(num.charAt(i));
            if(n%2==0) even.add(n);
            else odd.add(n);
        }
        if(spl.length()%2==0){

            //if want to print all even first
           // for(int i=0;i<even.size();i++) System.out.print(even.get(i));
//            for(int i=0;i<odd.size();i++) System.out.print(odd.get(i));

            //For alternate
            int i=0,j=0;
            while (i<even.size() && j<odd.size()){
                System.out.print(even.get(i));
                System.out.print(odd.get(j));
                i++;j++;
            }
            while (i<even.size()){
                System.out.print(even.get(i));i++;
            }
            while (j<odd.size()){
                System.out.print(odd.get(j));j++;
            }


        }else{
            //IF WANT TO PRINT ALL ODD FIRST THEN EVEN
//            for(int i=0;i<odd.size();i++) System.out.print(odd.get(i));
//            for(int i=0;i<even.size();i++) System.out.print(even.get(i));

            //FOR ALTERNATE
            int i=0,j=0;
            while (i<odd.size() && j<even.size()){
                System.out.print(odd.get(i));
                System.out.print(even.get(j));
                i++;j++;
            }
            while (i<odd.size()){
                System.out.print(odd.get(i));i++;
            }
            while (j<even.size()){
                System.out.print(even.get(j));j++;
            }

        }
    }
}

//A5w8@k7!l23n69
//8265739

//#bn7856!@kn2n65jbnj482375
//7553758626482
