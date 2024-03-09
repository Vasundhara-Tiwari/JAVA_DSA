package Tree;

public class BinaryTreeClient {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.display();
        System.out.println(bt.max());
        System.out.println(bt.find(40));
        System.out.println(bt.height());
        bt.preOrder();
        bt.postOrder();
        bt.inOrder();
        bt.levelOrder();
    }
}
