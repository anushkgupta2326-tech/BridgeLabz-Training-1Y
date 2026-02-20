package com.gla.string.extras.transformations;

import java.util.Scanner;

public class ToggleCase {
    public static String readInput(Scanner scanner) {
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }

    public static String toggleCase(String text) {
        char[] characters = text.toCharArray();
        for (int index = 0; index < characters.length; index++) {
            char character = characters[index];
            if (character >= 'A' && character <= 'Z') {
                characters[index] = (char) (character + 32);
            } else if (character >= 'a' && character <= 'z') {
                characters[index] = (char) (character - 32);
            }
        }
        return new String(characters);
    }

    public static void displayOutput(String toggledText) {
        System.out.println("Toggled: " + toggledText);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = readInput(scanner);
        displayOutput(toggleCase(input));
        scanner.close();
    }
}
