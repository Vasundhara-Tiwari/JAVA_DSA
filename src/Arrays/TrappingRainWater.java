package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TrappingRainWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while(testCases > 0){
            int size = scanner.nextInt();
            int[] arr = new int[size];
            for(int i = 0; i < size; i++){
                arr[i] = scanner.nextInt();
            }
            System.out.println(trap(arr));
            testCases--;
        }
    }
    public static int trap(int[] height) {
        int[] leftHighest = new int[height.length];
        int[] rightHighest = new int[height.length];
        leftHighest[0] = height[0];
        for(int i = 1; i < height.length; i++){
            leftHighest[i] = Math.max(leftHighest[i-1], height[i]);
        }
        rightHighest[height.length-1] = height[height.length-1];
        for(int i = height.length-2; i >= 0; i--){
            rightHighest[i] = Math.max(rightHighest[i+1], height[i]);
        }
        int waterTrapped = 0;
        for(int i = 0; i < height.length; i++){
            waterTrapped += (Math.min(leftHighest[i], rightHighest[i]) - height[i]);
        }
        return waterTrapped;
    }
}
