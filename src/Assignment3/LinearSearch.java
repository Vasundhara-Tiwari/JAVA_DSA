package Assignment3;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        int resultIndex = -1;
        for(int i = 0; i < size; i++){
            if(arr[i] == key){
                resultIndex = i;
            }
        }
        System.out.println(resultIndex);
    }
}
