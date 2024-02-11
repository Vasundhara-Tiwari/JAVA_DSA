package Stack;

import java.util.Stack;

public class InsertElementAtBottom {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);
        add(stack, -7);
        System.out.println(stack);
    }
    public static void add(Stack<Integer> stack, int item){
        if(stack.isEmpty()){
            stack.push(item);
            return;
        }
        int ele = stack.pop();
        add(stack, item);
        stack.push(ele);
    }
}
