package Stack;

public class StackImplementation {
    private int[] stack;
    private int index = 0;

    public StackImplementation(){
        stack = new int[5];
    }

    public StackImplementation(int n){
        stack = new int[n];
    }

    public void push(int element){
        try{
            if(stack.length <= index){
                throw new Exception("Stack Overflow!!!");
            }
            stack[index] = element;
            index++;
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public int pop(){
        try{
            if(index < 0){
                throw new Exception("Stack Underflow!!!");
            }
            int element = stack[index-1];
            index--;
            return element;
        } catch (Exception e){
            System.out.println(e);
            return -1;
        }
    }

    public int peek(){
        try{
            if(index < 0){
                throw new Exception("Stack Underflow!!!");
            }
            return stack[index-1];
        } catch (Exception e){
            System.out.println(e);
            return -1;
        }
    }
    public int getSize(){
        return index;
    }

    public boolean isEmpty(){
        return index == 1;
    }
}
