package com.gla.extras.numberlogic;

import java.util.Scanner;

public class GCDLCMCalculator {
    public static int[] readInput(Scanner scanner) {
        System.out.print("Enter first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter second number: ");
        int second = scanner.nextInt();
        return new int[]{first, second};
    }

    public static int findGcd(int first, int second) {
        first = Math.abs(first);
        second = Math.abs(second);
        while (second != 0) {
            int temp = second;
            second = first % second;
            first = temp;
        }
        return first;
    }

    public static int findLcm(int first, int second) {
        int gcd = findGcd(first, second);
        return gcd == 0 ? 0 : Math.abs(first * second) / gcd;
    }

    public static void displayOutput(int first, int second) {
        System.out.println("GCD: " + findGcd(first, second));
        System.out.println("LCM: " + findLcm(first, second));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = readInput(scanner);
        displayOutput(input[0], input[1]);
        scanner.close();
    }
}
