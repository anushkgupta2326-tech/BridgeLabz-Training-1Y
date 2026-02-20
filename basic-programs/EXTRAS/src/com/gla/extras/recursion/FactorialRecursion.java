package com.gla.extras.recursion;

import java.util.Scanner;

public class FactorialRecursion {
    public static int readInput(Scanner scanner) {
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }

    public static long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed.");
        }
        if (number <= 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }

    public static void displayOutput(int number, long result) {
        System.out.println("Factorial of " + number + " is " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int number = readInput(scanner);
            displayOutput(number, factorial(number));
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            scanner.close();
        }
    }
}
