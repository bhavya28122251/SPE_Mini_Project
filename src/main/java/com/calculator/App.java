package com.calculator;

import java.util.Scanner;

public class App {

    // Square Root Function
    public static double squareRoot(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number.");
        }
        return Math.sqrt(x);
    }

    // Factorial Function
    public static int factorial(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }

    // Natural Logarithm Function
    public static double naturalLog(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Natural logarithm is not defined for zero or negative numbers.");
        }
        return Math.log(x);
    }

    // Power Function (x^b)
    public static double power(double x, double b) {
        return Math.pow(x, b);
    }

    // Main Method - Menu Driven Program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter to Start");
        scanner.nextLine();

        while (true) {
            System.out.println("\nScientific Calculator:");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Logarithm (ln(x))");
            System.out.println("4. Power Function (x^b)");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number: ");
                    double num = scanner.nextDouble();
                    System.out.println("√" + num + " = " + squareRoot(num));
                    break;
                case 2:
                    System.out.print("Enter an integer: ");
                    int n = scanner.nextInt();
                    System.out.println(n + "! = " + factorial(n));
                    break;
                case 3:
                    System.out.print("Enter number: ");
                    double logNum = scanner.nextDouble();
                    System.out.println("ln(" + logNum + ") = " + naturalLog(logNum));
                    break;
                case 4:
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exponent = scanner.nextDouble();
                    System.out.println(base + "^" + exponent + " = " + power(base, exponent));
                    break;
                case 5:
                    System.out.println("Exiting Calculator.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option! Please choose again.");
            }
        }
    }
}
