package com.company;

import java.util.Scanner;

public class Problem8 {

    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        if (passwordIsValid(text)) {
            System.out.println("Your password is valid !!");
        } else {
            System.out.println("Something went wrong...");
        }
    }

    public static boolean passwordIsValid( String text ) {
        int letterCount = 0;
        int digitCount = 0;

        if (text.length() < 10) {
            return false;
        } else {
            for (int i = 0; i < text.length(); i++) {
                if (containsDigits(text.charAt(i))) {
                    digitCount++;
                } else if (containsLetters(text.charAt(i))) {
                    letterCount++;
                } else {
                    return false;
                }
            }
        }
        return (digitCount >= 2 && letterCount >= 2);
    }

    public static boolean containsLetters( char letterSymbol ) {
        return ((letterSymbol >= 'A' && letterSymbol <= 'Z') || (letterSymbol >= 'a' && letterSymbol <= 'z'));
    }

    public static boolean containsDigits( char digitSymbol ) {
        return (digitSymbol >= '0' && digitSymbol <= '9');
    }

}
