package Infosys.InfyTq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
//NOT SOLVED

//Concatinate Alphabet in Group

//given string "HeLloOWorLDd"
//
//        Task is to form group of leter like:
//        Grp d-> Dd (in the order they appear in input string)
//        Grp l-> LlL
//        Grp h-> h
//        Grp r->r
//        Grp o->oOo
//        Etc.
//
//        Then arrange these group in ascending,
//
//        Then print 1 grp from asceding follwd by last grp in ascending,
//        Print scond grp from ascending follwed by second last in ascending, and so on
//
//        Output: DdWerHoOoLlL

public class Wordmanipulation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();//.toUpperCase();
        char[] c = s.toCharArray();
        ArrayList<String> ans = new ArrayList<>();
        HashMap<Character,Boolean> used = new HashMap<>();
        used.put(c[0],false);
        for (int i=0;i<s.length()-1;i++){
                String temp = c[i] + "";
                for (int j = i + 1; j < s.length(); j++) {
                    if (Character.toLowerCase(c[i]) == Character.toLowerCase(c[j])) {
                            temp += (c[j] + "");
                            used.put(c[j],true);
                            c[j] = '#';
                    }
                }
                ans.add(temp);
        }
        ans.add(c[s.length()-1]+"");
        ArrayList<String> finalS = new ArrayList<>();
        for (int i=0;i<ans.size();i++){
            String k = ans.get(i);
            if (!ans.get(i).contains("#"))finalS.add(k);
        }

//        System.out.println(finalS);
//        Collections.sort(finalS);
        String finalAnsPrint = "";
        int x = 0,y = finalS.size()-1;
        while (x<y){
            finalAnsPrint+=finalS.get(x)+finalS.get(y);
            x++;y--;
        }
//        System.out.println(finalS);
//        System.out.println(finalAnsPrint);

    }
}

//HelLoWOrld
//dWerHoOlLl