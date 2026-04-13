import java.util.*;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int k = 3;
        int n = arr.length;

        k = k % n;

        int[] left = new int[n];
        for (int i = 0; i < n; i++) {
            left[i] = arr[(i + k) % n];
        }

        for (int x : left) {
            System.out.print(x + " ");
        }

        System.out.println();

        int[] right = new int[n];
        for (int i = 0; i < n; i++) {
            right[(i + k) % n] = arr[i];
        }

        for (int x : right) {
            System.out.print(x + " ");
        }
    }
}