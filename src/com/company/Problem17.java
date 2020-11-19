package com.company;

import java.util.Scanner;

public class Problem17 {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int[] array = new int[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        System.out.println(factorialOfNumber(array));
    }

    public static int factorialOfNumber( int[] array ) {
        int factorial = 1;
        for (int j : array) {
            factorial *= j;
        }
        return factorial;
    }
}
