package com.roy._12methods.hw;

import java.util.Scanner;

public class MatrixRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please, enter matrix size: ");
        int size = in.nextInt();
        double[][] matrix = generateMatrix(size);

        System.out.println("How you want to rotate matrix:" + System.lineSeparator() +
                "\t1 - 90" + System.lineSeparator() +
                "\t2 - 180" + System.lineSeparator() +
                "\t3 - 270");
        int mode = in.nextInt();

        System.out.println(System.lineSeparator() + "Base matrix:" + System.lineSeparator());
        printMatrixToConsole(matrix);
        System.out.println();

        if (rotateMatrix(matrix, mode)) {
            printMatrixToConsole(matrix);
        }
    }

    public static void rotate90(double[][] matrix) {

        //transpose
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = i; j < matrix[i].length ; j++) {
                double temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // row reverse
        for (int i = 0; i < matrix.length ; i++) {
            int low = 0;
            int high = matrix.length - 1;
            while (low < high) {
                double temp = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high] = temp;

                low++;
                high--;
            }
        }

    }

    public static void rotate180(double[][] matrix) {
        rotate90(matrix);
        rotate90(matrix);
    }

    public static void rotate270(double[][] matrix) {
        rotate90(matrix);
        rotate90(matrix);
        rotate90(matrix);
    }

    public static void printMatrixToConsole(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] generateMatrix(int size) {
        double[][] matrix = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = Double.parseDouble(i + "." + j);
            }
        }
        return matrix;
    }

    public static boolean rotateMatrix(double[][] matrix, int mode) {
        switch (mode) {
            case 1:
                rotate90(matrix);
                return true;
            case 2:
                rotate180(matrix);
                return true;
            case 3:
                rotate270(matrix);
                return true;
            default:
                return false;
        }
    }

}
