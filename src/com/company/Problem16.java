package com.company;

import java.util.Scanner;

public class Problem16 {

    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        System.out.println(isPallindrome(word));
    }

    public static boolean isPallindrome( String word ) {
        boolean isPallindrome = false;
        int letterCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(word.length() - i - 1)) {
                letterCount++;
            }
        }
        if (letterCount == word.length()) {
            isPallindrome = true;
        }
        return isPallindrome;
    }
}