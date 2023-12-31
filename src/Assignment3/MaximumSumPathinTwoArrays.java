package Assignment3;

import java.util.Scanner;

public class MaximumSumPathinTwoArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while(testCase > 0){
            int size1 = scanner.nextInt();
            int size2 = scanner.nextInt();
            int[] arr1 = new int[size1];
            int[] arr2 = new int[size2];
            for(int i = 0; i < size1; i++){
                arr1[i] = scanner.nextInt();
            }
            for(int i = 0; i < size2; i++){
                arr2[i] = scanner.nextInt();
            }
            int sum1 = 0;
            int sum2 = 0;
            int sumResult = 0;
            int i = 0, j = 0;
            while(i < arr1.length && j < arr2.length){
                if(arr1[i] < arr2[j]){
                    sum1 += arr1[i++];
                }
                else if(arr2[j] < arr1[i]){
                    sum2 += arr2[j++];
                }
                else{
                    sumResult += Math.max(sum1, sum2) + arr2[j];
                    sum1 = 0;
                    sum2 = 0;
                    i++;
                    j++;
                }
            }
            while (i < size1)
                sum1 += arr1[i++];
            while (j < size2)
                sum2 += arr2[j++];
            sumResult += Math.max(sum1, sum2);
            System.out.println(sumResult);
            testCase--;
        }
    }
}
