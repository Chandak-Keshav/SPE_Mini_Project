package com.example;
import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("Scientific Calculator");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Logarithm (ln(x))");
            System.out.println("4. Power (x^y)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    double sqrtInput = scanner.nextDouble();
                    System.out.println("√" + sqrtInput + " = " + Math.sqrt(sqrtInput));
                    break;
                case 2:
                    System.out.print("Enter a non-negative integer: ");
                    int factorialInput = scanner.nextInt();
                    if (factorialInput < 0) {
                        System.out.println("Factorial is not defined for negative numbers.");
                    } else {
                        System.out.println(factorialInput + "! = " + factorial(factorialInput));
                    }
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    double lnInput = scanner.nextDouble();
                    if (lnInput <= 0) {
                        System.out.println("Natural logarithm is only defined for positive numbers.");
                    } else {
                        System.out.println("ln(" + lnInput + ") = " + Math.log(lnInput));
                    }
                    break;
                case 4:
                    System.out.print("Enter the base (x): ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the exponent (y): ");
                    double exponent = scanner.nextDouble();
                    System.out.println(base + "^" + exponent + " = " + Math.pow(base, exponent));
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
            System.out.println();
        } while (choice != 5);

        scanner.close();
    }

    private static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
