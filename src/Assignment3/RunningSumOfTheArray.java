package Assignment3;

import java.util.Scanner;

public class RunningSumOfTheArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        arr = calculateRunningSum(arr);
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] calculateRunningSum(int[] arr) {
        int sum = arr[0];
        for(int i = 1; i < arr.length; i++){
            sum += arr[i];
            arr[i] = sum;
        }
        return arr;
    }
}
