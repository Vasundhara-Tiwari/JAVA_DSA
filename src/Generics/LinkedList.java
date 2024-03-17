package Generics;

public class LinkedList<T> {
    public class Node {
        T val;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size; // default 0 initialized hoga

    // O(1)
    public void addFirst(T item) {
        Node nn = new Node();
        nn.val = item;

        if(size==0) {
            head = nn;
            tail = nn;
            size++;
        }
        else {
            nn.next = head;
            head = nn;
            size++;
        }
    }

    // O(n)
    public void Display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val + "-->");
            temp = temp.next;
        }
        System.out.println(".");
    }

    // O(1)
    public void addLast(T item) {
        if(size == 0) {
            addFirst(item);
        }
        else {
            Node nn = new Node();
            nn.val = item;
            tail.next = nn;
            tail = nn;
            size++;
        }
    }

    // O(n)
    public Node getNode(int k) {
        Node temp = head;
        for(int i = 0; i < k; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void addAtIndex(int idx, T item) {
        if(idx == 0) {
            addFirst(item);
        }
        else if(idx == size) {
            addLast(item);
        }
        else {
            Node nn = new Node();
            nn.val = item;
            Node k_1 = getNode(idx - 1);
            nn.next = k_1.next;
            k_1.next = nn;
            size++;
        }
    }

    // O(1)
    public T getFirst() {
        return head.val;
    }

    // O(1)
    public T getLast() {
        return tail.val;
    }

    // O(n)
    public T getAtIndex(int idx) {
        return getNode(idx).val;
    }

    // O(1)
    public T removeFirst() {
        T v = head.val;
        if(size == 1) {
            head = null;
            tail = null;
            size--;
        }
        else {
            Node temp = head;
            head = head.next;
            temp.next = null; // This is written to free the memory when garbage collector comes to see.
            size--;
        }
        return v;
    }

    // O(1)
    public T removeLast() {
        if(size == 1) {
            return removeFirst();
        }
        else {
            Node temp = getNode(size-2);
            T v = tail.val;
            tail.next = null;
            size--;
            return v;
        }
    }

    public T removeAtIndex(int idx) {
        if(idx == 0) {
            return removeFirst();
        }
        else if (idx == size-1) {
            return removeLast();
        }
        else {
            Node curr = getNode(idx);
            Node prev = getNode(idx-1);
            prev.next = curr.next;
            curr.next = null;
            size--;
            return curr.val;
        }
    }
}
