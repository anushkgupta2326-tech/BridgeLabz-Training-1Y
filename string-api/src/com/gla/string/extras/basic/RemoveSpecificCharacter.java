package com.gla.string.extras.basic;

import java.util.Scanner;

public class RemoveSpecificCharacter {
    public static Object[] readInput(Scanner scanner) {
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        System.out.print("Enter character to remove: ");
        char target = scanner.nextLine().charAt(0);
        return new Object[]{text, target};
    }

    public static String removeCharacter(String text, char target) {
        StringBuilder builder = new StringBuilder();
        for (int index = 0; index < text.length(); index++) {
            if (text.charAt(index) != target) {
                builder.append(text.charAt(index));
            }
        }
        return builder.toString();
    }

    public static void displayOutput(String result) {
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Object[] input = readInput(scanner);
        displayOutput(removeCharacter((String) input[0], (char) input[1]));
        scanner.close();
    }
}
