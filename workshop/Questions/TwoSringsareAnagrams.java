package workshop.Questions;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSringsareAnagrams {

	public static boolean areAnagrams(String first, String second) {
		String s1 = first.replaceAll("\\s+", "").toLowerCase();
		String s2 = second.replaceAll("\\s+", "").toLowerCase();

		if (s1.length() != s2.length()) {
			return false;
		}

		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();

		Arrays.sort(a1);
		Arrays.sort(a2);

		return Arrays.equals(a1, a2);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String first = scanner.nextLine();

		System.out.print("Enter second string: ");
		String second = scanner.nextLine();

		if (areAnagrams(first, second)) {
			System.out.println("Both strings are anagrams.");
		} else {
			System.out.println("Both strings are not anagrams.");
		}

		scanner.close();
	}
}
