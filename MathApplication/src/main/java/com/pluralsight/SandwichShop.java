package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double discount = 0;
        double basePrice = 0.00;


        System.out.println("Select size of the sandwich: ");
        System.out.println("1: Regular: base price $5.45");
        System.out.println("2: Large: base price $8.95");

        System.out.println("Select 1 or 2: ");
        double selectSize = scanner.nextDouble();
        if (selectSize == 1) {
            basePrice = 5.45;
        } else if (selectSize == 2) {
            basePrice = 8.95;
        }


        System.out.println("Enter age: ");
        double age = scanner.nextDouble();

        if (age <= 17) {
            discount = 0.10;
        } else if (age >= 65) {
            discount = 0.20;
        } else {
            System.out.println("No added discount");
        }
        double discountBase = basePrice * (1-discount);

        if (discount > 0) {
            System.out.printf("Final price: $%.2f", discountBase);
        }
        else {
            System.out.print("Final price: $" + basePrice);
        }


        scanner.close();

        {

        }






    }

}
