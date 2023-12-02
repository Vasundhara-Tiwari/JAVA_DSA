package Arrays;

import java.util.Arrays;
public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {7, 3, 1, 6, 3, 8, 5, 4};
        System.out.println(trap(arr));
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
        System.out.println(Arrays.toString(leftHighest));
        System.out.println(Arrays.toString(rightHighest));
        int waterTrapped = 0;
        for(int i = 0; i < height.length; i++){
            waterTrapped += (Math.min(leftHighest[i], rightHighest[i]) - height[i]);
        }
        return waterTrapped;
    }
}
