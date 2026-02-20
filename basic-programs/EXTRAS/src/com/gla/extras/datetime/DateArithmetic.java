package com.gla.extras.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateArithmetic {
    // Reads a base date and number of days.
    public static Object[] readInput(Scanner scanner) {
        System.out.print("Enter date (yyyy-MM-dd): ");
        LocalDate inputDate = LocalDate.parse(scanner.nextLine());
        System.out.print("Enter number of days to add/subtract: ");
        int days = Integer.parseInt(scanner.nextLine());
        return new Object[]{inputDate, days};
    }

    public static LocalDate addDays(LocalDate date, int days) {
        return date.plusDays(days);
    }

    public static LocalDate subtractDays(LocalDate date, int days) {
        return date.minusDays(days);
    }

    public static long daysBetween(LocalDate startDate, LocalDate endDate) {
        return ChronoUnit.DAYS.between(startDate, endDate);
    }

    public static void displayOutput(LocalDate inputDate, int days) {
        LocalDate addedDate = addDays(inputDate, days);
        LocalDate subtractedDate = subtractDays(inputDate, days);
        System.out.println("Date after adding days: " + addedDate);
        System.out.println("Date after subtracting days: " + subtractedDate);
        System.out.println("Days between subtracted and added date: " + daysBetween(subtractedDate, addedDate));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Object[] input = readInput(scanner);
            displayOutput((LocalDate) input[0], (int) input[1]);
        } catch (Exception exception) {
            System.out.println("Invalid date or day input format.");
        } finally {
            scanner.close();
        }
    }
}
