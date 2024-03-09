package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
    public class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;

    public BinaryTree(){
        root = createTree();
    }
    Scanner scanner = new Scanner(System.in);
    private Node createTree(){
        int item = scanner.nextInt();
        Node node = new Node();
        node.val = item;
        boolean hasLeftChild = scanner.nextBoolean();
        if(hasLeftChild){
            node.left = createTree();
        }
        boolean hasRightChild = scanner.nextBoolean();
        if(hasRightChild){
            node.right = createTree();
        }
        return node;
    }

    public void display(){
        display(root);
    }
    private void display(Node node){
        if(node == null){
            return;
        }
        String s = "";
        s = "<--" + node.val + "-->";
        if(node.left != null){
            s = node.left.val + s;
        }
        else{
            s = "..." + s;
        }
        if(node.right != null){
            s = s + node.right.val;
        }
        else{
            s = s + "...";
        }
        System.out.println(s);
        display(node.left);
        display(node.right);
    }

    public int max(){
        return max(root);
    }

    private int max(Node node){
        if(node == null){
            return Integer.MIN_VALUE;
        }
        int left = max(node.left);
        int right = max(node.right);
        return Math.max(left, Math.max(node.val, right));
    }
    public boolean find(int item){
        return find(item, root);
    }
    private boolean find(int item , Node node){
        if(node == null) {
            return false;
        }
        if(node.val == item){
            return true;
        }
        boolean left = find(item, node.left);
        boolean right = find(item, node.right);
        return left || right;
    }

    public int height(){
        return height(root);
    }

    private int height(Node node){
        if(node == null){
            return -1;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public void preOrder(){
        preOrder(root);
        System.out.println();
    }

    private void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.val+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
        System.out.println();
    }

    private void postOrder(Node node){
        if(node == null){
            return;
        }
        preOrder(node.left);
        preOrder(node.right);
        System.out.print(node.val+" ");
    }

    public void inOrder(){
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node node){
        if(node == null){
            return;
        }
        preOrder(node.left);
        System.out.print(node.val+" ");
        preOrder(node.right);
    }

    public void levelOrder(){
        levelOrder(root);
        System.out.println();
    }

    private void levelOrder(Node node){
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while (!q.isEmpty()){
            // remove first
            Node rv = q.remove();
            System.out.println(rv.val);
            if(rv.left != null){
                q.add(rv.left);
            }
            if(rv.right != null){
                q.add(rv.right);
            }
        }
        System.out.println();
    }
}
