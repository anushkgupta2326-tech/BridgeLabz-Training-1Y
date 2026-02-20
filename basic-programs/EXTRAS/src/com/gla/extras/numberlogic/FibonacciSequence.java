package com.gla.extras.numberlogic;

import java.util.Scanner;

public class FibonacciSequence {
    public static int readInput(Scanner scanner) {
        System.out.print("Enter number of terms: ");
        return scanner.nextInt();
    }

    public static int[] generateSequence(int terms) {
        if (terms <= 0) {
            return new int[0];
        }
        int[] sequence = new int[terms];
        sequence[0] = 0;
        if (terms > 1) {
            sequence[1] = 1;
        }
        for (int index = 2; index < terms; index++) {
            sequence[index] = sequence[index - 1] + sequence[index - 2];
        }
        return sequence;
    }

    public static void displayOutput(int[] sequence) {
        System.out.print("Fibonacci sequence: ");
        for (int value : sequence) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int terms = readInput(scanner);
        displayOutput(generateSequence(terms));
        scanner.close();
    }
}
