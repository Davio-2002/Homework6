package com.company;

import java.util.Arrays;
import java.util.Random;

public class Problem12 {
    public static void main( String[] args ) {
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Unsorted array : " + Arrays.toString(array));

        // Ascending order
        System.out.println("Sorted array : " + Arrays.toString(sortAnArray(array)));
    }

    public static int[] sortAnArray( int[] array ) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }
}
