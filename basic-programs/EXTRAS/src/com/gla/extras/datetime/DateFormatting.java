package com.gla.extras.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    // Returns formatted datetime string for a pattern.
    public static String formatDateTime(LocalDateTime dateTime, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return dateTime.format(formatter);
    }

    public static void displayOutput(LocalDateTime now) {
        System.out.println("ISO format: " + now);
        System.out.println("Indian format: " + formatDateTime(now, "dd-MM-yyyy HH:mm:ss"));
        System.out.println("US format: " + formatDateTime(now, "MM/dd/yyyy hh:mm a"));
        System.out.println("Readable format: " + formatDateTime(now, "EEE, dd MMM yyyy HH:mm"));
    }

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        displayOutput(now);
    }
}
