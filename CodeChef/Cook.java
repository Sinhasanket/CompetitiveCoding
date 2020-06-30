package Codechef;

import java.util.Scanner;
import java.util.Stack;

public class Cook {
    public static void main(String[] argw) {
        Scanner sc = new Scanner(System.in);
        for(int t=sc.nextInt();t>0;t--){
            String infix = sc.next();
            Stack<Character> postfix = new Stack<>();
            for (int i=0;i<infix.length();i++){
                if(infix.charAt(i)>='a' && infix.charAt(i) <= 'z'){
                    System.out.print(infix.charAt(i));
                }
                if (infix.charAt(i)=='(' || infix.charAt(i)==')' || infix.charAt(i)=='+'||
                        infix.charAt(i)=='-' || infix.charAt(i)=='/' || infix.charAt(i)=='*' || infix.charAt(i)=='^'){

                    if (!postfix.isEmpty()){
                      //  System.out.println("Incoming :=== "+infix.charAt(i));
                        if (infix.charAt(i)=='^' && postfix.peek()=='/'){
                            System.out.print(infix.charAt(i));
                        }else if (postfix.peek()=='/' && infix.charAt(i)=='*'){
                           // char print = postfix.pop();
                            System.out.print(postfix.pop());
                            postfix.push(infix.charAt(i));
                        }else if (postfix.peek()=='+' && infix.charAt(i)=='-'){
                          //  char print = postfix.pop();
                            System.out.print(postfix.pop());
                            postfix.push(infix.charAt(i));
                        }else if(infix.charAt(i)==')'){
                            while (postfix.peek() != '('){
                                System.out.print(postfix.pop());
                            }
                            postfix.pop();

                        }else postfix.push(infix.charAt(i));

                    }else postfix.push(infix.charAt(i));
                }
            }
         //  System.out.println(postfix);
        }
    }
}