package com.company;

import java.util.Scanner;

public class Problem9 {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        System.out.println("Perimeter is : " + calculatePerimeter(radius));
        System.out.println("Area is : " + calculateArea(radius));
    }

    public static double calculatePerimeter(double radius) {
        return (2 * Math.PI * radius) ;
    }

    public static double calculateArea(double radius) {
        return Math.pow(radius, 2) * Math.PI;
    }
}
