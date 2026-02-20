package com.gla.extras.datetime;

import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
    // Reads two dates from user.
    public static LocalDate[] readInput(Scanner scanner) {
        System.out.print("Enter first date (yyyy-MM-dd): ");
        LocalDate firstDate = LocalDate.parse(scanner.nextLine());
        System.out.print("Enter second date (yyyy-MM-dd): ");
        LocalDate secondDate = LocalDate.parse(scanner.nextLine());
        return new LocalDate[]{firstDate, secondDate};
    }

    public static String compareDates(LocalDate firstDate, LocalDate secondDate) {
        if (firstDate.isBefore(secondDate)) {
            return "First date is before second date.";
        }
        if (firstDate.isAfter(secondDate)) {
            return "First date is after second date.";
        }
        return "Both dates are equal.";
    }

    public static void displayOutput(LocalDate firstDate, LocalDate secondDate) {
        System.out.println(compareDates(firstDate, secondDate));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            LocalDate[] dates = readInput(scanner);
            displayOutput(dates[0], dates[1]);
        } catch (Exception exception) {
            System.out.println("Invalid date format. Use yyyy-MM-dd.");
        } finally {
            scanner.close();
        }
    }
}
