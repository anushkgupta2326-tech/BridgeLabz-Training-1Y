package com.gla.string.extras.transformations;

import java.util.Scanner;

public class RemoveDuplicates {
    public static String readInput(Scanner scanner) {
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }

    public static String removeDuplicateCharacters(String text) {
        boolean[] seen = new boolean[256];
        StringBuilder builder = new StringBuilder();

        for (int index = 0; index < text.length(); index++) {
            char character = text.charAt(index);
            if (character < 256 && !seen[character]) {
                seen[character] = true;
                builder.append(character);
            }
        }
        return builder.toString();
    }

    public static void displayOutput(String result) {
        System.out.println("Without duplicates: " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = readInput(scanner);
        displayOutput(removeDuplicateCharacters(input));
        scanner.close();
    }
}
