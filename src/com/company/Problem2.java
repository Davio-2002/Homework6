package com.company;

import java.util.Scanner;

public class Problem2 {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.print("Your product is : ");
        System.out.println(doMultiplication(firstNumber, secondNumber));
    }

    public static int doMultiplication( int firstNumber, int secondNumber ) {
        return firstNumber * secondNumber;
    }
}
