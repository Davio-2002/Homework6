package com.company;

import java.util.Scanner;

public class Problem5 {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        System.out.println(findMiddleLetterInText(text));
    }

    public static char findMiddleLetterInText( String text) {
        return text.charAt(text.length()/2);
    }
}
