package com.gla.string.extras.analysis;

import java.util.Scanner;

public class CountVowelsConsonants {
    public static String readInput(Scanner scanner) {
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }

    public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0;
        int consonants = 0;
        String lower = text.toLowerCase();

        for (int index = 0; index < lower.length(); index++) {
            char character = lower.charAt(index);
            if (character >= 'a' && character <= 'z') {
                if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void displayOutput(int[] counts) {
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = readInput(scanner);
        displayOutput(countVowelsAndConsonants(input));
        scanner.close();
    }
}
