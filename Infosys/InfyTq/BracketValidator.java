package Infosys.InfyTq;

import java.util.Scanner;
import java.util.Stack;

//Check proper nesting of string if it is nested well return 0 else return position where nesting is not proper
//indexing starts from 1

public class BracketValidator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.replaceAll(",","");
        Stack<Character> st = new Stack<>();
        int ans = 0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='(' ||str.charAt(i)=='{' ||str.charAt(i)=='['){
                st.push(str.charAt(i));
            }else if (str.charAt(i)==')' ||str.charAt(i)=='}' || str.charAt(i)==']'){
                if (!st.isEmpty()){
                    char top = st.peek();
                    char curr = str.charAt(i);
                    boolean b = checkValid(top,curr);
                    if (b){
                        st.pop();
                    }else {
                        ans=i+1;
                        break;
                    }
                }else {
                    ans=i+1;
                    break;
                }

            }
        }
        System.out.println(ans);
    }

    private static boolean checkValid(char c,char cr){
        if (c=='(' && cr==')')return true;
        else if (c=='[' && cr==']')return true;
        else if (c=='{' && cr=='}')return true;
        return false;
    }
}

//{,(,[,],),},[,]
//0

//{,{,[,],},},}
//7

//{,(,[,],),],[,]
//6

//),[,],{,[,(,),],}
//1