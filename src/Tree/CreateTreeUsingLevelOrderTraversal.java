package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CreateTreeUsingLevelOrderTraversal {
    class Node{
        int val;
        Node left;
        Node right;

        public Node(){
        }

        public Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    private Node root;
     public CreateTreeUsingLevelOrderTraversal(){
         createTree();
     }
     Scanner scanner = new Scanner(System.in);
     private void createTree(){
         Queue<Node> q = new LinkedList<>();
         int item = scanner.nextInt();
         Node node = new Node();
         node.val = item;
         root = node;
         q.add(node);
         while (!q.isEmpty()){
             Node r = q.poll();
             int c1 = scanner.nextInt();
             int c2 = scanner.nextInt();
             if(c1 != -1){
                 Node newNode = new Node();
                 newNode.val = c1;
                 r.left = newNode;
                 q.add(newNode);
             }
             if(c2 != -1){
                 Node newNode = new Node();
                 newNode.val = c2;
                 r.right = newNode;
                 q.add(newNode);
             }
         }
     }
}
