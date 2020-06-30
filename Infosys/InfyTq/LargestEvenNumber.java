package Infosys.InfyTq;

import java.util.*;

public class LargestEvenNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        HashSet<Integer> li = new HashSet<>();
        for (Character ch:str.toCharArray()){
            if (Character.isDigit(ch)){
                li.add(Character.getNumericValue(ch));
            }
        }
        int small = -1;
        for (Integer num:li){
            if (num%2==0){
                small = num;
                li.remove(small);
                break;
            }
        }

        if (small==-1) System.out.println(-1);
        else {
            List<Integer> list = new ArrayList<>(li);
            Collections.sort(list, Collections.reverseOrder());

            String ans = "";
            for (Integer num:list){
                ans+=num;
            }

            System.out.println(ans+small);
        }
    }
}

//infosys@337
//-1
//Hello#81@21349