package com.gla.extras.utilities;

import java.util.Scanner;

public class BasicCalculator {
    public static double[] readNumbers(Scanner scanner) {
        System.out.print("Enter first number: ");
        double first = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double second = scanner.nextDouble();
        return new double[]{first, second};
    }

    public static char readOperation(Scanner scanner) {
        System.out.print("Enter operation (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    public static double calculate(double first, double second, char operation) {
        switch (operation) {
            case '+':
                return first + second;
            case '-':
                return first - second;
            case '*':
                return first * second;
            case '/':
                if (second == 0) {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
                return first / second;
            default:
                throw new IllegalArgumentException("Invalid operation.");
        }
    }

    public static void displayOutput(double result) {
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            double[] numbers = readNumbers(scanner);
            char operation = readOperation(scanner);
            displayOutput(calculate(numbers[0], numbers[1], operation));
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            scanner.close();
        }
    }
}
