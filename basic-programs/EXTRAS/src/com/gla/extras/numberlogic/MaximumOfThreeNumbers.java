package com.gla.extras.numberlogic;

import java.util.Scanner;

public class MaximumOfThreeNumbers {
    public static int[] readInput(Scanner scanner) {
        System.out.print("Enter first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter second number: ");
        int second = scanner.nextInt();
        System.out.print("Enter third number: ");
        int third = scanner.nextInt();
        return new int[]{first, second, third};
    }

    public static int findMaximum(int first, int second, int third) {
        return Math.max(first, Math.max(second, third));
    }

    public static void displayOutput(int maximum) {
        System.out.println("Maximum number: " + maximum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = readInput(scanner);
        displayOutput(findMaximum(input[0], input[1], input[2]));
        scanner.close();
    }
}
