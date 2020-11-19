package com.company;

import java.util.Scanner;

public class Problem7 {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        int yearNumber = scanner.nextInt();

        isLeapYear(yearNumber);
    }

    public static void isLeapYear( int yearNumber ) {
        if ((yearNumber % 4 == 0 && yearNumber % 100 != 0) || yearNumber % 400 == 0) {
            System.out.println(yearNumber + " is a leap year. ");
        } else {
            System.out.println(yearNumber + " is not a leap year");
        }
    }
}
