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
        double finalLoadedPrice;


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

        System.out.println("Would you like the sandwich loaded? (yes/no) ");
        String usersChoice = scanner.next();
        if (usersChoice.equals("yes")) {
            loadedPrice = (selectSize == 1) ? 1.00 : 1.75;
        } else if (usersChoice.equals("no")) {
            System.out.println("No added loaded sandwich");
        }


        System.out.println("Enter age: ");
        double age = scanner.nextDouble();

        if (age <= 17) {
            discount = 0.10;
        } else if (age >= 65) {
            discount = 0.20;
        } else {
            System.out.println("No added discount: $" + basePrice);
        }


        finalPrice = (loadedPrice + basePrice) * (1 - discount);
        finalLoadedPrice = (basePrice + loadedPrice);


        if (discount > 0 && loadedPrice > 0) {
            System.out.printf("The total price: $%.2f", finalPrice);
        } else if (discount < 0 && loadedPrice < 0) {
            System.out.println("Final price: $" + finalLoadedPrice);
        }
        else {
            System.out.println("Total price: $" + basePrice);
        }

        scanner.close();
    }
}