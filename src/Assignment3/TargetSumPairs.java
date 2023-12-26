package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        Arrays.sort(arr);
        for(int i = 0; i < size; i++){
            for(int j = i+1; j < size; j++){
                if(target == arr[i] + arr[j]){
                    System.out.println(arr[i]+" and "+arr[j]);
                }
            }
        }
    }
}
