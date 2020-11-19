package com.company;

import java.util.Random;
import java.util.Scanner;

public class Problem18 {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        String[][] matrix = new String[size][size];

        initializeAndPrintMatrix(matrix);
    }

    public static void initializeAndPrintMatrix( String[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int temp = random.nextInt(2);
                if (temp == 1) {
                    matrix[i][j] = "+";
                } else {
                    matrix[i][j] = "-";
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}