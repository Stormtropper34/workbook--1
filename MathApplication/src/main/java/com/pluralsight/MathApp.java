package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        // Exercise 1
        double bobSalary = 50000.0;
        double garySalary = 60000.0;

        double highestSalary;

        highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is " + highestSalary);

        // Exercise 2
        double carPrice = 45000.00;
        double truckPrice = 302000.0;

        double lowestPrice = Math.min(carPrice, truckPrice);

        System.out.println("The lowest Price is: " + lowestPrice );

        // Exercise 3
        double circle_Radius = 7.25;
        double circle_area = Math.PI * Math.pow(circle_Radius, 2);

        System.out.println("Area of a circle is: " + circle_Radius);

        // Exercise 4
        double square_root = 5.0;

        double SquareRoot = Math.sqrt(square_root);

        System.out.println("Square root is: " + SquareRoot);

        // Exercise 5 - Find and display the distance between the points (5, 10) and (85, 50)
        double x1 = 5.0;
        double y1 = 10.0;
        double x2 = 85.0;
        double y2 = 50.0;

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("The distance between the points is: " + distance);









        // Exercise 6
        double NumAbsValue = -3.8;

        double AbsoluteValue = Math.abs(NumAbsValue);

        System.out.println("The Absolute Value is: " + AbsoluteValue);

        // Last Exercise 7
        double Num_random = Math.random();

        System.out.println("Random Number (0-10): " + Num_random);



    }

}

