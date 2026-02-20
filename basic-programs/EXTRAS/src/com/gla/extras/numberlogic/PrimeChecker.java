package com.gla.extras.numberlogic;

import java.util.Scanner;

public class PrimeChecker {
    public static int readInput(Scanner scanner) {
        System.out.print("Enter number: ");
        return scanner.nextInt();
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int divisor = 2; divisor * divisor <= number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static void displayOutput(int number, boolean prime) {
        System.out.println(number + (prime ? " is prime." : " is not prime."));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = readInput(scanner);
        displayOutput(number, isPrime(number));
        scanner.close();
    }
}
