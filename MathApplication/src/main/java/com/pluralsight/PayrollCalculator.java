package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();

        System.out.println("Enter pay rate: ");
        double payRate = scanner.nextDouble();

        double grossPay = hoursWorked * payRate;

        System.out.println("Your name: " + name);
        System.out.printf("Your gross pay is: %.2f",  grossPay);

        scanner.close();







    }
}
