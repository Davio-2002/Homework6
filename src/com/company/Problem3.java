package com.company;

import java.util.Scanner;

public class Problem3 {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.println("Product is : " + doMultiplicationOfNumbers(firstNumber, secondNumber));
        System.out.println("Cube of product is : " + cubeTheProduct(firstNumber, secondNumber));
    }

    public static int doMultiplicationOfNumbers( int firstNumber, int secondNumber ) {
        return firstNumber * secondNumber;
    }

    public static double cubeTheProduct( int firstNumber, int secondNumber ) {
        return Math.pow(doMultiplicationOfNumbers(firstNumber, secondNumber), 3);
    }
}
