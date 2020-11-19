package com.company;

import java.util.Scanner;

public class Problem10 {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        double firstSide = scanner.nextDouble();
        double secondSide = scanner.nextDouble();
        double thirdSide = scanner.nextDouble();

        if (checkIfTriangleIsValid(firstSide, secondSide, thirdSide)) {
            System.out.println("This triangle is not valid !");
            System.out.println("Perimeter: " + calculatePerimeterOfTriangle(firstSide, secondSide, thirdSide));
            System.out.println("Area: " + calculateAreaOfTriangle(firstSide, secondSide, thirdSide));
        } else {
            System.out.println("This triangle is valid !");
        }
    }

    public static boolean checkIfTriangleIsValid( double firstSide, double secondSide, double thirdSide ) {
        return (firstSide + secondSide > thirdSide &&
                secondSide + thirdSide > firstSide &&
                firstSide + thirdSide > secondSide);
    }

    public static double calculateAreaOfTriangle( double firstSide, double secondSide, double thirdSide ) {
        double halfPerimeter = (firstSide + secondSide + thirdSide) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - firstSide) * (halfPerimeter - secondSide) * (halfPerimeter - thirdSide));
    }

    public static double calculatePerimeterOfTriangle( double firstSide, double secondSide, double thirdSide ) {
        return firstSide + secondSide + thirdSide;
    }
}
