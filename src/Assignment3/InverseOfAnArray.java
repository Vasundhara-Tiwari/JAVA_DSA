package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class InverseOfAnArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        array = invertArray(array);
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }

    }

    private static int[] invertArray(int[] array) {
        int i = 0;
        int[] newArray = new int[array.length];
        while(i < array.length){
            int element = array[i];
            newArray[element] = i;
            i++;
        }
        return newArray;
    }
}
