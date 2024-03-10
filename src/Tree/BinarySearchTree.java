package Tree;

public class BinarySearchTree {
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
    public BinarySearchTree(int[] in){
        createTree(in, 0, in.length - 1);
    }
    private Node createTree(int[] in, int startIndex, int endIndex){
        if(startIndex > endIndex){
            return null;
        }
        int mid = (startIndex + endIndex) / 2;
        Node newNode = new Node();
        newNode.val = in[mid];
        newNode.left = createTree(in, startIndex, mid-1);
        newNode.right = createTree(in, mid+1, endIndex);
        return newNode;
    }
}
