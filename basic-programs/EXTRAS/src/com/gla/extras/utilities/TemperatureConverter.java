package com.gla.extras.utilities;

import java.util.Scanner;

public class TemperatureConverter {
    public static double readInput(Scanner scanner) {
        System.out.print("Enter temperature in Celsius: ");
        return scanner.nextDouble();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static void displayOutput(double celsius) {
        System.out.println("Fahrenheit: " + celsiusToFahrenheit(celsius));
        System.out.println("Kelvin: " + celsiusToKelvin(celsius));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = readInput(scanner);
        displayOutput(celsius);
        scanner.close();
    }
}
