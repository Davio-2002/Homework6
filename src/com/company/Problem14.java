package com.company;

public class Problem14 {
    public static void main( String[] args ) {

        System.out.println("Prime numbers are : ");
        printPrimeNumbersLessThanHundred();
    }

    public static void printPrimeNumbersLessThanHundred() {
        for (int i = 0; i < 100; i++) {
            int primeCount = 0;
            for (int j = i; j >= 1; --j) {
                if (i % j == 0) {
                    primeCount++;
                }
            }
            if (primeCount == 2) {
                System.out.println(i);
            }
        }
    }
}