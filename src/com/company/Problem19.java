package com.company;

import java.util.Random;
import java.util.Scanner;

public class Problem19 {
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

        System.out.println("Rotated in 90 degrees\n");
        rotateMatrixInNinetyDegrees(matrix, N);

        System.out.println("Rotated in 180 degrees\n");
        rotateMatrixInOneHundredEightyDegrees(matrix, N);

        System.out.println("Rotated in 270 degrees\n");
        rotateMatrixInTwoHundredSeventyDegrees(matrix, N);
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

    public static void rotateMatrixInOneHundredEightyDegrees( int[][] matrix, int N ) {
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
