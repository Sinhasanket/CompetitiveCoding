package Infosys.Hackwithinfy;

import java.util.Scanner;

public class OrderOfLeavingParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int n1[] = new int[n - 1];
            int n2[] = new int[n - 2];
            int n3[] = new int[n - 3];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            for (int i = 0; i < n - 1; i++) n1[i] = sc.nextInt();
            for (int i = 0; i < n - 2; i++) n2[i] = sc.nextInt();
            for (int i = 0; i < n - 3; i++) n3[i] = sc.nextInt();
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                if (i < n - 1 && arr[i] != n1[i]) {
                    System.out.print(arr[i] + " ");
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.print(arr[n - 1] + " ");
            flag = true;
            for (int i = 0; i < n - 1; i++) {
                if (i < n - 2 && n1[i] != n2[i]) {
                    System.out.print(n1[i] + " ");
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.print(n1[n - 2] + " ");
            flag = true;
            for (int i = 0; i < n - 2; i++) {
                if (i < n - 3 && n2[i] != n3[i]) {
                    System.out.print(n2[i] + " ");
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.print(n2[n - 3] + " ");
            System.out.println();
        }
    }

}
