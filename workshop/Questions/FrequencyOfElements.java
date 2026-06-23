package workshop.Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfElements {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number of elements: ");
		int n = scanner.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter " + n + " elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		Map<Integer, Integer> frequencyMap = new HashMap<>();
		for (int value : arr) {
			frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
		}

		System.out.println("Frequency of elements:");
		for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

		scanner.close();
	}
}
