package com.gla.string.extras.basic;

import java.util.Scanner;

public class ReverseString {
    // Reads input string.
    public static String readInput(Scanner scanner) {
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }

    // Reverses string manually without built-in reverse.
    public static String reverseString(String text) {
        char[] characters = text.toCharArray();
        char[] reversed = new char[characters.length];
        for (int index = 0; index < characters.length; index++) {
            reversed[index] = characters[characters.length - 1 - index];
        }
        return new String(reversed);
    }

    // Displays output.
    public static void displayOutput(String original, String reversed) {
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = readInput(scanner);
        displayOutput(input, reverseString(input));
        scanner.close();
    }
}
