package Infosys.Hackwithinfy;

import java.util.*;

class LargestIndexDiff{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            Stack<Integer> st = new Stack<>();
            st.push(n-1);
            for(int i=n-2;i>=0;i--){
                if(arr[i] > arr[i+1]){
                    continue;
                }else{
                    int rem = st.pop();
                    int calc = rem - (i+1);
                    st.push(calc);
                    st.push(i);
                }
            }
            int max = Integer.MIN_VALUE;
            while(!st.isEmpty()){
                int rm = st.pop();
                if(rm>max)max=rm;
            }
            System.out.println(max);

        }
    }
}
        //Input
//        2
//        6 21 13 18 10 7 3
//        10 100 98 76 56 23 0 -2 -6 9 10

        //Output
//        3
//        7