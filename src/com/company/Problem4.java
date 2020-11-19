package com.company;

import java.util.Scanner;

public class Problem4 {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        System.out.println("Maximum from three is : " + findMaxAmongThreeNumbers(firstNumber, secondNumber, thirdNumber));
    }

    public static int findMaxAmongThreeNumbers( int firstNumber, int secondNumber, int thirdNumber ) {
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            return firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            return secondNumber;
        } else {
            return thirdNumber;
        }
    }
}
