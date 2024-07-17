package Assignment6;

import java.util.Scanner;

public class SubsetProblem {
    static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        subsetSum(arr, target, 0, 0, "");
        System.out.println("\n"+count);
    }

    private static void subsetSum(int[] arr, int target, int i, int j, String ans) {
        if(i == arr.length){
            return;
        } else if(i > j){
            subsetSum(arr, target-arr[i], 0, j+1, ans+arr[i]+" ");
        }
        else {
            int sum = 0;
            for (int k = i; k < j; k++) {
                sum += arr[k];
                subsetSum(arr, target-arr[k], i+1, j, ans+arr[k]+" ");
            }
            if(sum == target){
                count++;
            }
        }
        return;
    }
}
