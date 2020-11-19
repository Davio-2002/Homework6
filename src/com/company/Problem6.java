package com.company;

import java.util.Scanner;

public class Problem6 {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        System.out.println(findCountOfWords(text) + " words");
    }

    public static int findCountOfWords( String text ) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }
        return count + 1;
    }
}
