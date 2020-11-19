package com.company;

import java.util.Random;

public class Problem1 {

    public static void main( String[] args ) {
        Random random = new Random();

        int firstNumber = random.nextInt(1000);
        int secondNumber = random.nextInt(1000);

        System.out.print("Your sum is : ");
        System.out.println(doSumOfNumbers(firstNumber, secondNumber));
    }

    public static int doSumOfNumbers( int firstNumber, int secondNumber ) {
        return firstNumber + secondNumber;
    }
}
