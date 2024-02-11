package Stack;

import java.util.Stack;

public class TheCelebrityProblem {
    public static void main(String[] args) {
        int[][] arr = { { 0, 1, 1, 1 }, { 1, 0, 1, 1 }, { 0, 0, 0, 0 }, { 1, 1, 1, 0 } };
        System.out.println(celebrity(arr));
    }

    public static int celebrity(int[][] arr){
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            stack.push(i);
        }
        while (stack.size() > 1){
            int a = stack.pop();
            int b = stack.pop();
            if(arr[a][b] == 1){
                stack.push(b);
            }
            else{
                stack.push(a);
            }
        }
        int candidate = stack.pop();
        for(int i = 0; i < arr.length; i++){
            if(i == candidate){
                continue;
            }
            if(arr[candidate][i] == 1){
                return -1;
            }
        }
        return candidate;
    }
}
