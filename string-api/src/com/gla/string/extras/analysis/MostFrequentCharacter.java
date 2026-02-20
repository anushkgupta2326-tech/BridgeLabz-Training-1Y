package com.gla.string.extras.analysis;

import java.util.Scanner;

public class MostFrequentCharacter {
    public static String readInput(Scanner scanner) {
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }

    public static Object[] findMostFrequentCharacter(String text) {
        int[] frequency = new int[256];
        for (int index = 0; index < text.length(); index++) {
            char character = text.charAt(index);
            if (character < 256) {
                frequency[character]++;
            }
        }

        int maxCount = 0;
        char frequentCharacter = '\0';
        for (int index = 0; index < text.length(); index++) {
            char character = text.charAt(index);
            if (character < 256 && frequency[character] > maxCount) {
                maxCount = frequency[character];
                frequentCharacter = character;
            }
        }
        return new Object[]{frequentCharacter, maxCount};
    }

    public static void displayOutput(char character, int count) {
        System.out.println("Most frequent character: '" + character + "' occurred " + count + " times.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = readInput(scanner);
        Object[] result = findMostFrequentCharacter(input);
        displayOutput((char) result[0], (int) result[1]);
        scanner.close();
    }
}
