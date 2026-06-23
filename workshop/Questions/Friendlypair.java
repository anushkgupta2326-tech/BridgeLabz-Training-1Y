package workshop.Questions;

import java.util.*;

public class Friendlypair{
    
    public static long sumOfDivisors(int n) {
        long sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static boolean isPerfect(int n) {
        return sumOfDivisors(n) == n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        if (isPerfect(a) && isPerfect(b)) {
            System.out.println("yes they are a friendly pair");
        } else {
            System.out.println("no they are not a friendly pair");
        }
        
        scanner.close();
    }
}

    
