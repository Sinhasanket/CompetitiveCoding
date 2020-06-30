package Infosys.Hackwithinfy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MinRotation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String arr[]=new String[n];
        ArrayList<Character> cr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr[i]=br.readLine();
            cr.add(arr[i].charAt(0));
        }
        boolean flag = true;
        int min = Integer.MAX_VALUE;
        for (int c=0;c<cr.size()-1;c++){
            int calc = 0;
            for(int i=0;i<n;i++){
                String get = arr[i];
                int idx = get.indexOf(cr.get(c));
                if (idx==-1){
                    System.out.println("-1");
                    flag = false;
                    break;
                }
                calc+=idx;
            }
            min = Math.min(min,calc);
            if (!flag)break;
        }

        if (flag) System.out.println(min);
    }
}
