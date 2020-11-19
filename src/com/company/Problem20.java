package com.company;

import java.util.Random;
import java.util.Scanner;

public class Problem20 {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        // Size
        System.out.print("Enter size of matrix -> ");
        int N = scanner.nextInt();

        int[][] matrix = initializeAndCreateMatrix(N);

        System.out.println("Original matrix\n");
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        System.out.println();

        while (true) {
            System.out.println("Press 1 For rotating 90*");
            System.out.println("Press 2 For rotating 180*");
            System.out.println("Press 3 For rotating 270*");
            System.out.println("Press 4 to Exit\n");

            System.out.print("Option (1, 2, 3 or 4) -> ");

            int option = scanner.nextInt();

            switch (option) {
                case 1 -> rotateMatrixInNinetyDegrees(matrix, N);
                case 2 -> rotateMatrixInOneHundredEightyDegrees(matrix);
                case 3 -> rotateMatrixInTwoHundredSeventyDegrees(matrix, N);
                case 4 -> {
                    System.out.println("Termination...");
                    System.exit(0);
                }
                default -> System.out.println("Something went wrong. Try again\n");
            }
        }
    }

    public static int[][] initializeAndCreateMatrix( int N ) {
        int[][] matrix = new int[N][N];
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(51) + 27;
            }
        }
        return matrix;
    }

    public static void rotateMatrixInNinetyDegrees( int[][] matrix, int N ) {
        int[][] rotatedMatrix = new int[N][N];
        for (int i = 0; i < rotatedMatrix.length; i++) {
            for (int j = rotatedMatrix[i].length - 1; j >= 0; j--) {
                rotatedMatrix[i][j] = matrix[j][i];
                System.out.print(rotatedMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void rotateMatrixInOneHundredEightyDegrees( int[][] matrix ) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[matrix.length - i - 1][matrix[i].length - 1 - j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void rotateMatrixInTwoHundredSeventyDegrees( int[][] matrix, int N ) {
        int[][] rotatedMatrix = new int[N][N];
        for (int i = rotatedMatrix.length - 1; i >= 0; i--) {
            for (int j = 0; j < rotatedMatrix[i].length; j++) {
                rotatedMatrix[i][j] = matrix[j][i];
                System.out.print(rotatedMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
