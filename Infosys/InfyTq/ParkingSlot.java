package Infosys.InfyTq;

import java.util.Scanner;

public class ParkingSlot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String lane1[] = sc.nextLine().split(",");
        String lane2[] = sc.nextLine().split(",");
        String lane3[] = sc.nextLine().split(",");
        String lane4[] = sc.nextLine().split(",");
        int waitingCar = sc.nextInt();
        int totalFree = 40 - (lane1.length+lane2.length+lane3.length+lane4.length);
        if (totalFree < waitingCar){
            System.out.println("X");
        }else {
            int len1 = lane1.length;
            int len2 = lane2.length;
            int len3 = lane3.length;
            int len4 = lane4.length;

            while (waitingCar != 0) {
                if (len1 <= len2 && len1 <= len3 && len1 <= len4) {
                    int empty = 10 - len1;
                    while (waitingCar != 0 && empty != 0 && len1 <= 10) {
                        len1++;
                        waitingCar--;
                        empty--;
                        System.out.print("A" + len1 + " ");
                    }
                }

                if (len2 <= len1 && len2<= len3 && len2 <= len4) {
                    int empty = 10 - len2;
                    while (waitingCar != 0 && empty != 0 && len2 <= 10) {
                        len2++;
                        waitingCar--;
                        empty--;
                        System.out.print("B" + len2 + " ");
                    }
                }

                if (len3 <= len1 && len3 <= len2 && len3 <= len4) {
                    int empty = 10 - len3;
                    while (waitingCar != 0 && empty != 0 && len3 <= 10) {
                        len3++;
                        waitingCar--;
                        empty--;
                        System.out.print("C" + len3 + " ");
                    }
                }

                if (len4 <= len1 && len4 <= len2 && len4 <= len3) {
                    int empty = 10 -  len4;
                    while (waitingCar != 0 && empty != 0 && len4 <= 10) {
                        len4++;
                        waitingCar--;
                        empty--;
                        System.out.print("D" + len4 + " ");
                    }
                }
            }
        }
    }
}

//INPUT
//A1,A2,A3,A4
//B1,B2,B3
//C1,C2
//D1,D2,D3,D4,D5
//10

//OUTPUT
//C3 C4 C5 C6 C7 C8 C9 C10 B4 B5