package Infosys.InfyTq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//WRONG ANS

public class SubMatrixWithHigherSum {
    public static void main(String[] ags) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); String rcValues[] = br.readLine().split(",");
        int len = rcValues.length;
        int rc = (int)Math.sqrt(len);
        int matrix [][] = new int[rc][rc]; int idx = 0;
        for(int i = 0 ; i < rc ; i++) {
            for(int j = 0 ; j < rc ; j++) {
                matrix[i][j] = Integer.parseInt(rcValues[idx]); idx++;
            }
        }
        int maximumSum = -1000000;
        for(int i = 0 ; i < rc ; i++) {
            for(int j = 0 ; j < rc ; j++) {
                for(int sqmt = 1 ; (sqmt+i < rc && sqmt+j < rc) ; sqmt++) {
                    int sum = maxSum(matrix, rc, i, j, sqmt);
                    maximumSum = sum;
                }
            }
        }

        for(int i = 0 ; i < rc ; i++) {
            for (int j = 0; j < rc; j++) {
                for (int sqmt = 1; (sqmt + i < rc && sqmt + j < rc); sqmt++) {
                    printMatrix(matrix, rc, i, j, sqmt, maximumSum);
                }
            }
        }
    }


    static void printMatrix(int matrix[][] , int rc , int r , int c , int d, int maxSum) {
//printing that matrix whose sum is equal to maxSum. int matrixSum = 0;
        int r2 = r;
        int c2 = c;
        int matrixSum = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < d + 1; i++) {
            for (int j = 0; j < d + 1; j++) {
                matrixSum += matrix[r2][c2];
                sb.append(matrix[r2][c2] + " ");
                c2++;
            }
            r2++;
            c2 = c;
            sb.append("\n");
        }
        if (matrixSum == maxSum) {
            System.out.println(sb.toString()); // matrix printing }
        }
    }

        static int maxSum ( int matrix[][], int rc, int r, int c, int d){
            int sum = 0;
            int r2 = r;
            int c2 = c;
            for (int i = 0; i < d + 1; i++) {
                for (int j = 0; j < d + 1; j++) {
                    sum += matrix[r2][c2];
                    c2++;
                }
                r2++;
                c2 = c;
            }
            return sum;
        }
}

//INPUT
//0,3,6,12,3,6,-12,3,-3

//---- Possible square Matrix from this input-
// 0 3 6
//12 3 6
//-12 3 -3

//There are 3 possible square submatrix whose sum are 18.
//OUTPUT
//0 3
//12 3
//
//3 6
//3 6

//0 3 6
//12 3 6
//-12 3 -3