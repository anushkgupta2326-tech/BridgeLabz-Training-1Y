package com.gla.extras.numberlogic;

import java.util.Scanner;

public class PalindromeChecker {
    public static int readInput(Scanner scanner) {
        System.out.print("Enter number: ");
        return scanner.nextInt();
    }

    public static boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;
        while (number > 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return original == reversed;
    }

    public static void displayOutput(int number, boolean palindrome) {
        System.out.println(number + (palindrome ? " is a palindrome." : " is not a palindrome."));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = readInput(scanner);
        displayOutput(number, isPalindrome(number));
        scanner.close();
    }
}
