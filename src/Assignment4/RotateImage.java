package Assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class RotateImage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = size-1; j >= 0; j--) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for (int i = size/2; i < size; i++) {
            int[] temp = arr[i];
            arr[i] = arr[size-i-1];
            arr[size-i-1] = temp;
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
