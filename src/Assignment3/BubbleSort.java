package Assignment3;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = scanner.nextInt();
        }
        sort(arr);
        for(int i = 0; i < size; i++){
            System.out.println(arr[i]);
        }
    }
    public static void sort(int[] arr){
        for(int turn = 1; turn < arr.length; turn++){
            for(int i = 0; i < arr.length-turn; i++){
                if(arr[i] > arr[i +1]) {
                    int temp = arr[i];
                    arr[i] = arr[i +1];
                    arr[i +1] = temp;
                }
            }
        }
    }
}
