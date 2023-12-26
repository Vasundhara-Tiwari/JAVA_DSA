package Assignment3;

import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        reverseNum(arr, 0, size - 1);
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void reverseNum(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
