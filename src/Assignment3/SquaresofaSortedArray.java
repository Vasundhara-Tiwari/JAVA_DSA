package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class SquaresofaSortedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            arr[i] = arr[i] * arr[i];
        }
        Arrays.sort(arr);
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
