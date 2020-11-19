package com.company;

import java.util.Arrays;
import java.util.Random;

public class Problem11 {

    static Random random = new Random();

    public static void main( String[] args ) {
        int[] array = new int[10];

        System.out.println(Arrays.toString(arrayInitializerWithRandomNumbers(array)));
    }

    public static int[] arrayInitializerWithRandomNumbers( int[] array ) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }
}
