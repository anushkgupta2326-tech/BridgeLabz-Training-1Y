package com.gla.string.extras.basic;

import java.util.Scanner;

public class CompareTwoStrings {
    public static String[] readInput(Scanner scanner) {
        System.out.print("Enter first string: ");
        String first = scanner.nextLine();
        System.out.print("Enter second string: ");
        String second = scanner.nextLine();
        return new String[]{first, second};
    }

    public static boolean areEqualCaseSensitive(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        for (int index = 0; index < first.length(); index++) {
            if (first.charAt(index) != second.charAt(index)) {
                return false;
            }
        }
        return true;
    }

    public static boolean areEqualIgnoreCase(String first, String second) {
        return areEqualCaseSensitive(first.toLowerCase(), second.toLowerCase());
    }

    public static void displayOutput(String first, String second) {
        System.out.println("Case-sensitive equal: " + areEqualCaseSensitive(first, second));
        System.out.println("Ignore-case equal: " + areEqualIgnoreCase(first, second));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = readInput(scanner);
        displayOutput(input[0], input[1]);
        scanner.close();
    }
}
