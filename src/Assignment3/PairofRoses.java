package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class PairofRoses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while(testCases > 0){
            int size = scanner.nextInt();
            int[] arr = new int[size];
            for(int i = 0; i < size; i++){
                arr[i] = scanner.nextInt();
            }
            int totalMoney = scanner.nextInt();
            int diff = Integer.MAX_VALUE;
            int ans1 = 0;
            int ans2 = 0;
            Arrays.sort(arr);
            for(int i = 0; i < size; i++){
                for(int j = i+1; j < size; j++){
                    if(totalMoney == arr[i] + arr[j] && Math.abs(arr[i] - arr[j]) < diff){
                        ans1 = arr[i];
                        ans2 = arr[j];
                        diff = Math.abs(arr[i] - arr[j]);
                    }
                }
            }
            System.out.println("Deepak should buy roses whose prices are "+ ans1 + " and " + ans2 + ".");
            testCases--;
        }
    }
}
