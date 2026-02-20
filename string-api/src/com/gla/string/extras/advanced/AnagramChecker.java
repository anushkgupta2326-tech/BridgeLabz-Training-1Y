package com.gla.string.extras.advanced;

import java.util.Scanner;

public class AnagramChecker {
    public static String[] readInput(Scanner scanner) {
        System.out.print("Enter first string: ");
        String first = scanner.nextLine();
        System.out.print("Enter second string: ");
        String second = scanner.nextLine();
        return new String[]{first, second};
    }

    public static String normalize(String text) {
        return text.toLowerCase().replace(" ", "");
    }

    public static boolean areAnagrams(String first, String second) {
        String normalizedFirst = normalize(first);
        String normalizedSecond = normalize(second);

        if (normalizedFirst.length() != normalizedSecond.length()) {
            return false;
        }

        int[] frequency = new int[256];
        for (int index = 0; index < normalizedFirst.length(); index++) {
            frequency[normalizedFirst.charAt(index)]++;
            frequency[normalizedSecond.charAt(index)]--;
        }

        for (int value : frequency) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }

    public static void displayOutput(boolean anagram) {
        System.out.println("Anagram: " + anagram);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = readInput(scanner);
        displayOutput(areAnagrams(input[0], input[1]));
        scanner.close();
    }
}
