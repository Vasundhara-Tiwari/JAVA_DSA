package Trie;

import java.util.HashMap;

public class TrieContacts {
    public class Node {
        Character val;
        Boolean color;
        int count = 1;
        HashMap<Character, Node> child = new HashMap<>();

    }
    private Node root;
    public TrieContacts(){
        Node nn = new Node();
        nn.val = '*';
        root = nn;
    }

    public void insert(String word){
        Node current = root;
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(current.child.containsKey(ch)){
                current = current.child.get(ch);
                current.count++;
            } else {
                Node node = new Node();
                node.val = ch;
                current.child.put(ch, node);
                current = node;
            }
        }
        current.color = true;
    }
    public boolean search(String word){
        Node current = root;
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(current.child.containsKey(ch)){
                current = current.child.get(ch);
            } else {
                return false;
            }
        }
        return current.color;
    }

    public boolean startsWith(String prefix){
        Node current = root;
        for(int i = 0; i < prefix.length(); i++){
            char ch = prefix.charAt(i);
            if(current.child.containsKey(ch)){
                current = current.child.get(ch);
            } else {
                return false;
            }
        }
        return true;
    }
}
