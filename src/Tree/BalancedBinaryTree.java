package Tree;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null){
            return true;
        }
        boolean leftBalanced = isBalanced(root.left);
        boolean rightBalanced = isBalanced(root.right);
        boolean selfBalanced = Math.abs(height(root.left) -  height(root.right)) <= 1;
        return leftBalanced && rightBalanced && selfBalanced;
    }
    private int height(TreeNode node){
        if(node == null){
            return -1;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
