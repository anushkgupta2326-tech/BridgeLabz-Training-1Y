package com.gla.extras.datetime;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeZoneDisplay {
    // Reads zone IDs from user.
    public static String[] readInput(Scanner scanner) {
        System.out.print("Enter first timezone (e.g., Asia/Kolkata): ");
        String firstZone = scanner.nextLine();
        System.out.print("Enter second timezone (e.g., Europe/London): ");
        String secondZone = scanner.nextLine();
        return new String[]{firstZone, secondZone};
    }

    // Returns formatted current time in the given timezone.
    public static String getFormattedNow(String zoneId) {
        ZonedDateTime currentTime = ZonedDateTime.now(java.time.ZoneId.of(zoneId));
        return currentTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z"));
    }

    // Prints output section.
    public static void displayOutput(String firstZone, String secondZone) {
        System.out.println("Current time in " + firstZone + ": " + getFormattedNow(firstZone));
        System.out.println("Current time in " + secondZone + ": " + getFormattedNow(secondZone));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String[] zones = readInput(scanner);
            displayOutput(zones[0], zones[1]);
        } catch (Exception exception) {
            System.out.println("Invalid timezone input. Please use valid zone IDs.");
        } finally {
            scanner.close();
        }
    }
}
