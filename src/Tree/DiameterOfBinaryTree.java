package Tree;

public class DiameterOfBinaryTree {
    class Solution {
        public int diameterOfBinaryTree(TreeNode root) {
            return diameter(root);
        }

        public int diameter(TreeNode root) {
            if (root == null){
                return 0;
            }
            int leftDiameter = diameter(root.left);
            int rightDiameter = diameter(root.left);
            int selfDiameter = height(root.left) + height(root.right) + 2;
            return Math.max(leftDiameter, Math.max(rightDiameter, selfDiameter));
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
}
