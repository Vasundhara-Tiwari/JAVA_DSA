package Stack;

public class StackImplementationClient {
    public static void main(String[] args) {
        StackImplementation stack = new StackImplementation(4);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
