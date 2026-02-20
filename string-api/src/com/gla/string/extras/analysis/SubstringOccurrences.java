package com.gla.string.extras.analysis;

import java.util.Scanner;

public class SubstringOccurrences {
    public static String[] readInput(Scanner scanner) {
        System.out.print("Enter main string: ");
        String text = scanner.nextLine();
        System.out.print("Enter substring: ");
        String sub = scanner.nextLine();
        return new String[]{text, sub};
    }

    public static int countOccurrences(String text, String sub) {
        if (sub.isEmpty()) {
            return 0;
        }
        int count = 0;
        for (int index = 0; index <= text.length() - sub.length(); index++) {
            boolean match = true;
            for (int offset = 0; offset < sub.length(); offset++) {
                if (text.charAt(index + offset) != sub.charAt(offset)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                count++;
            }
        }
        return count;
    }

    public static void displayOutput(int count) {
        System.out.println("Occurrences: " + count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = readInput(scanner);
        displayOutput(countOccurrences(input[0], input[1]));
        scanner.close();
    }
}
