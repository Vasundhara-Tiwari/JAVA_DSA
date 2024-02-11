package Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class TheNextGreater {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t > 0) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++)
                arr[i] = scn.nextInt();
            nextLarger(arr);
            t--;
        }
    }
    public static void nextLarger(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            while(!stack.isEmpty() && arr[i] > arr[stack.peek()]){
                ans[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()){
            ans[stack.pop()] = -1;
        }
        System.out.println(Arrays.toString(ans));
    }
}
