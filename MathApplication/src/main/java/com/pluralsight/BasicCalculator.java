package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator{
      public static void main(String[] args) {

          Scanner scanner = new Scanner(System.in);

          System.out.print("Enter the first number: ");
          double firstNumber = scanner.nextDouble();

          System.out.print("Enter the second number: ");
          double secondNumber = scanner.nextDouble();

          System.out.println("Possible calculation: ");
          System.out.println("(A)dd");
          System.out.println("(S)ubtract");
          System.out.println("(M)ultiply");
          System.out.println("D)ivide");

          System.out.print("Select option: ");
          String UsersOption = scanner.next();

          double finalResults = firstNumber * secondNumber;

          System.out.print(finalResults);

          scanner.close();


      }
}
