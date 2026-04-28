package workshop.Questions;

import java.util.HashSet;
import java.util.Set;

public class Arraysubset {

	public static boolean isSubset(int[] arr1, int[] arr2) {
		Set<Integer> elements = new HashSet<>();
		for (int value : arr1) {
			elements.add(value);
		}

		for (int value : arr2) {
			if (!elements.contains(value)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {3, 4, 5};
		int[] arr3 = {3, 4, 6};
		int[] arr4 = {1, 2, 9};

		if (isSubset(arr1, arr2)) {
			System.out.println("arr2 is a subset of arr1 (arr1 contains all elements of arr2)");
		} else {
			System.out.println("arr2 is not a subset of arr1");
		}

		if (isSubset(arr3, arr4)) {
			System.out.println("arr3 is a subset of arr1");
		} else {
			System.out.println("arr3 is not a subset of arr1 (arr1 does not contain all elements of arr3)");
		}
	}
}
