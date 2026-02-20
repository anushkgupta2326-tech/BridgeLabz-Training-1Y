package com.gla.string.extras.basic;

import java.util.Scanner;

public class PalindromeStringCheck {
    public static String readInput(Scanner scanner) {
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }

    public static boolean isPalindrome(String text) {
        char[] characters = text.toLowerCase().replace(" ", "").toCharArray();
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            if (characters[left] != characters[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void displayOutput(String text, boolean palindrome) {
        System.out.println("Input: " + text);
        System.out.println("Palindrome: " + palindrome);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = readInput(scanner);
        displayOutput(text, isPalindrome(text));
        scanner.close();
    }
}
