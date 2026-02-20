package com.gla.string.extras.transformations;

import java.util.Scanner;

public class ReplaceWordInSentence {
    public static String[] readInput(Scanner scanner) {
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter target word: ");
        String target = scanner.nextLine();
        System.out.print("Enter replacement word: ");
        String replacement = scanner.nextLine();
        return new String[]{sentence, target, replacement};
    }

    public static String replaceWord(String sentence, String target, String replacement) {
        String[] words = sentence.split(" ");
        StringBuilder builder = new StringBuilder();

        for (int index = 0; index < words.length; index++) {
            if (words[index].equals(target)) {
                builder.append(replacement);
            } else {
                builder.append(words[index]);
            }
            if (index < words.length - 1) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }

    public static void displayOutput(String result) {
        System.out.println("Updated sentence: " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = readInput(scanner);
        displayOutput(replaceWord(input[0], input[1], input[2]));
        scanner.close();
    }
}
