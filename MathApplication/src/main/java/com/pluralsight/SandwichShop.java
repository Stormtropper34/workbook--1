package com.pluralsight;

import java.awt.desktop.SystemEventListener;
import java.util.Objects;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double discount = 0.00;
        double basePrice = 0.00;
        double loadedPrice = 0.00;
        double finalPrice;

// Select between regular and large 
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
// Asking user if they would like a loaded sandwich
        System.out.println("Would you like the sandwich loaded? (yes/no) ");
        String usersChoice = scanner.next();
        if (usersChoice.equals("yes")) {
            loadedPrice = (selectSize == 1) ? 1.00 : 1.75;
        }

// Users Age
        System.out.println("Enter age: ");
        double age = scanner.nextDouble();

        if (age <= 17) {
            discount = 0.10;
        } else if (age >= 65) {
            discount = 0.20;
        } else {
            System.out.println("No added discount");
        }

// Calculation:
        finalPrice = (loadedPrice + basePrice) * (1 - discount);

        if (loadedPrice > 0) {
            System.out.println("The loaded percent: $" + loadedPrice);
        }
        if (discount > 0) {
            System.out.println("Total discount: $" + (discount * 100 ));

        }
        System.out.printf("Total is: $%.2f", finalPrice);

        scanner.close();
    }
}