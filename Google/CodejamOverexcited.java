package Google;

import java.util.Scanner;

public class CodejamOverexcited {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int z = 1;
        for (int i=0;i<t;i++){
            int eastx = sc.nextInt();
            int northy = sc.nextInt();
            int X = 0;
            int Y = 0;
            String moves = sc.next();
            String im = "IMPOSSIBLE";
            boolean flag = false;
            int totalMoves = 0;
            for (int j=0;j<moves.length();j++){
                 char curr = moves.charAt(j);
                 if (eastx==X && northy==Y){
                     flag = true;
                     break;
                 }
                 switch (curr){
                     case 'S':
                         X++;
                         northy--;
                         break;
                     case 'N':
                         northy++;
                         Y++;
                         break;
                     case 'E':
                         eastx++;
                         X++;
                         break;
                     case 'W':
                         eastx--;
                         break;
                 }
            }
            System.out.println("Case #"+z+": "+((flag)?totalMoves:im));
            z++;
        }
    }
}
