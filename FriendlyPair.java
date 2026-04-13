import java.util.*;

public class FriendlyPair {
    
    public static int sumOfDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int a = 6;
        int b = 28;

        int sumA = sumOfDivisors(a);
        int sumB = sumOfDivisors(b);

        if ((double)sumA / a == (double)sumB / b) {
            System.out.println("Yes, they are a friendly pair");
        } else {
            System.out.println("No, they are not a friendly pair");
        }
    }
}