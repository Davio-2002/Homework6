package com.company;

import java.util.Arrays;
import java.util.Random;

public class Problem15 {
    public static void main( String[] args ) {
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(99) + 1;
        }

        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.toString(reverseArray(array)));
    }

    public static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[10];
        for (int i = array.length - 1; i >= 0 ; --i) {
            reversedArray[array.length - i - 1] = array[i];
        }
        return reversedArray;
    }
}
