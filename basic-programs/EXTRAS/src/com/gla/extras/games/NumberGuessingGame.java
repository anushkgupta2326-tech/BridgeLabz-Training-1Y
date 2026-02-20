package com.gla.extras.games;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static int generateTargetNumber(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }

    public static void playGame(Scanner scanner, int target) {
        int attempts = 0;
        boolean guessed = false;

        System.out.println("Guess a number between 1 and 100.");
        while (!guessed) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < target) {
                System.out.println("Too low!");
            } else if (guess > target) {
                System.out.println("Too high!");
            } else {
                guessed = true;
                System.out.println("Correct! You guessed in " + attempts + " attempts.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = generateTargetNumber(1, 100);
        playGame(scanner, target);
        scanner.close();
    }
}
