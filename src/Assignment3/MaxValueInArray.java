package Assignment3;

import java.util.Scanner;

public class MaxValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = scanner.nextInt();
        }
        int result = arr[0];
        for(int i = 1; i < size; i++){
            if(arr[i] > result){
                result = arr[i];
            }
        }
        System.out.println(result);
    }
}
