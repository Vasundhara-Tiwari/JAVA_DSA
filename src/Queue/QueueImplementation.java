package Queue;

public class QueueImplementation {
    // Add - Enqueue
    // Remove - Dequeue
    // view - getFront

    private int[] queue;
    private int front = 0;
    private int size = 0;

    public QueueImplementation(){
        queue = new int[5];
    }

    public QueueImplementation(int size){
        queue = new int[size];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == queue.length;
    }

    public void enqueue(int element){
        try {
            if(isFull()){
                throw new Exception("Queue is full");
            }
            int index = (front + size)%queue.length;
            queue[index] = element;
            size++;
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public int dequeue(){
        try{
            if(isEmpty()){
                throw new Exception("Queue is empty");
            }
            int element = queue[front-1];
            front=(front+1)%queue.length;
            size--;
            return element;
        } catch (Exception e){
            System.out.println(e);
            return -1;
        }
    }

    public int getFront(){
        return queue[front];
    }

    public int size(){
        return size;
    }

    public void display(){
        for(int i = 0; i < size; i++){
            int index = (front+i)%queue.length;
            System.out.print(queue[index]+" ");
        }
    }
}
