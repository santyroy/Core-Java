package com.roy._12methods.hw;

import java.util.Random;

public class TransposeMatrix {

    /*
        rotate 90 left =  transpose
        rotate 90 right =  transpose + row reverse
     */

    public static void main(String[] args) {

        System.out.println("\n========= Original matrix ============");
        int[][] originalMatrix = new int[5][5]; // row x col
        generateMatrix(originalMatrix);
        printMatrix(originalMatrix);

//        // below code works for any matrix
//        System.out.println("\n========= Transpose matrix ============");
//        int[][] transposeMatrix = new int[originalMatrix[0].length][originalMatrix.length]; // col x row
//        transposeMatrix(originalMatrix, transposeMatrix);
//        printMatrix(transposeMatrix);
//
//        // below code works only for square matrix
//        System.out.println("\n========= Transpose matrix ============");
//        transposeOriginalMatrix(originalMatrix);
//        printMatrix(originalMatrix);

        System.out.println("\n========= Rotate right matrix ============");
        rotateRightMatrix(originalMatrix);
        printMatrix(originalMatrix);
    }

    private static void generateMatrix(int[][] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(100);
            }
        }
    }

    private static void printMatrix(int[][] arr) {
        for (int[] row : arr) {
            for (int cell : row) {
                System.out.printf(" %02d", cell);
            }
            System.out.println();
        }
    }

    private static void transposeMatrix(int[][] arr, int[][] transpose) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
    }

    private static void transposeOriginalMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    private static void rotateRightMatrix(int[][] arr) {
        // transpose
        transposeOriginalMatrix(arr);

        // mirror/reverse the rows
        for (int i = 0; i < arr.length; i++) {
            int low = 0;
            int high = arr.length - 1;
            while (low < high) {
                int temp = arr[i][low];
                arr[i][low] = arr[i][high];
                arr[i][high] = temp;

                low++;
                high--;
            }
        }
    }
}
