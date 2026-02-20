package com.gla.string.extras.analysis;

import java.util.Scanner;

public class LongestWordFinder {
    public static String readInput(Scanner scanner) {
        System.out.print("Enter a sentence: ");
        return scanner.nextLine();
    }

    public static String findLongestWord(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static void displayOutput(String longestWord) {
        System.out.println("Longest word: " + longestWord);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = readInput(scanner);
        displayOutput(findLongestWord(sentence));
        scanner.close();
    }
}
