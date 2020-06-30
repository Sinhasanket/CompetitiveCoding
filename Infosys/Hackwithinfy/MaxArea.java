package Infosys.Hackwithinfy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MaxArea {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        String s = br.readLine();
        String[] take = s.split(" ");
        for (int i=0;i<take.length;i++){
            arr.add(Integer.parseInt(take[i]));
        }
        int i=0,j=arr.size()-1;
        int max = -1;
        while (i<j){
            max = Math.max(max,(j-i)*Math.min(arr.get(i),arr.get(j)));
            if (arr.get(i) <= arr.get(j)){
                i++;
            }else {
                j--;
            }
        }
        System.out.println(max);
    }
}
