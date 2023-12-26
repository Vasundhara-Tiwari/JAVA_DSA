package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumTriplets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        Arrays.sort(arr);
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                for(int k = j+1; k < n; k++){
                    if(target == arr[i] + arr[j] + arr[k]){
                        System.out.println(arr[i]+", "+arr[j]+" and "+arr[k]);
                    }
                }
            }
        }
    }
}
