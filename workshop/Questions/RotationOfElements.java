package workshop.Questions;

public class RotationOfElements {

	public static void rotateLeft(int[] arr, int k) {
		int n = arr.length;
		k = k % n;

		int[] temp = new int[k];
		for (int i = 0; i < k; i++) {
			temp[i] = arr[i];
		}

		for (int i = k; i < n; i++) {
			arr[i - k] = arr[i];
		}

		for (int i = 0; i < k; i++) {
			arr[n - k + i] = temp[i];
		}
	}

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60, 70};
		int k = 3;

		rotateLeft(arr, k);

		for (int value : arr) {
			System.out.print(value + " ");
		}
	}
}
