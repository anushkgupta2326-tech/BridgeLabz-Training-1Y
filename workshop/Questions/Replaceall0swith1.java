package workshop.Questions;

import java.util.Scanner;

public class Replaceall0swith1 {

	public static long replaceZerosWithOnes(long number) {
		if (number == 0) {
			return 1;
		}

		long result = 0;
		long place = 1;

		while (number > 0) {
			long digit = number % 10;
			if (digit == 0) {
				digit = 1;
			}
			result = result + (digit * place);
			place = place * 10;
			number = number / 10;
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		long number = scanner.nextLong();

		long updated = replaceZerosWithOnes(number);
		System.out.println("Number after replacing 0 with 1: " + updated);

		scanner.close();
	}
}
