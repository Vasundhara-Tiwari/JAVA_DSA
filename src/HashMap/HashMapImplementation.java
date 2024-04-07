package HashMap;

import Interface.A;

import java.util.ArrayList;

public class HashMapImplementation<K, V> {
    public class Node{
        K key;
        V value;
        Node next;
    }
    private ArrayList<Node> data;
    private int size = 0;
    public HashMapImplementation(){
        this(4);
    }

    public HashMapImplementation(int n){
        data = new ArrayList<>();
        for(int i = 0; i < n; i++){
            data.add(null);
        }
    }

    public void put(K key, V value){
        int bucketNumber = hashFunction(key);
        Node temp = data.get(bucketNumber);
        while(temp != null){
            if(temp.key.equals(key)) {
                temp.value = value;
                return;
            }
            temp = temp.next;
        }
        Node newNode = new Node();
        newNode.key = key;
        newNode.value = value;
        temp = data.get(bucketNumber);
        newNode.next = temp;
        data.set(bucketNumber, newNode);
        size++;
        double loadFactor = (1.0 * size) / data.size();
        double threshold = 2.0;
        if(loadFactor > threshold){
            rehashing();
        }
    }

    private void rehashing(){
        ArrayList<Node> ll = new ArrayList<>();
        for(int i = 0; i < 2*data.size(); i++){
            ll.add(null);
        }
        ArrayList<Node> oldList = data;
        data = ll;
        for(Node nn: oldList){
            while (nn != null){
                put(nn.key, nn.value);
                nn = nn.next;
            }
        }
    }

    public boolean containsKey(K key) {
        int bucketNumber = hashFunction(key);
        Node temp = data.get(bucketNumber);
        while(temp != null){
            if(temp.key.equals(key)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public V get(K key) {
        int bucketNumber = hashFunction(key);
        Node temp = data.get(bucketNumber);
        while(temp != null){
            if(temp.key.equals(key)) {
                return temp.value;
            }
            temp = temp.next;
        }
        return null;
    }

    public V remove(K key) {
        int bucketNumber = hashFunction(key);
        Node current = data.get(bucketNumber);
        Node previous = null;
        while(current != null){
            if(current.key.equals(key)){
                break;
            }
            previous = current;
            current = current.next;
        }
        if(current == null){
            return null;
        } else if(previous == null){
            data.set(bucketNumber, current.next);
            current.next = null;
            size--;
        } else {
            previous.next = current.next;
            size--;
        }
        return current.value;
    }

    public int hashFunction(K key){
        int h = key.hashCode() % data.size();
        if(h < 0){
            h += data.size();
        }
        return h;
    }

    @Override
    public String toString() {
        String str = "{";
        for(Node nn: data){
            while(nn != null){
                str = str + nn.key +
                        "=" + nn.value + ", ";
                nn = nn.next;
            }
        }
        str = str + "}";
        return str;
    }
}
