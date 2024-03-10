package Tree;

public class DiameterOfBinaryTreeOptimized {
    class Solution {
        public int diameterOfBinaryTree(TreeNode root) {
            return diameter(root).diameter;
        }

        class DiaPair{
            int diameter = 0;
            int height = -1;
        }
        public DiaPair diameter(TreeNode root){
            if(root == null){
                return new DiaPair();
            }
            DiaPair leftDiaPair = diameter(root.left);
            DiaPair rightDiaPair = diameter(root.right);
            DiaPair selfDiaPair = new DiaPair();
            selfDiaPair.height = Math.max(leftDiaPair.height, rightDiaPair.height) + 1;
            int selfDiameter = leftDiaPair.height + rightDiaPair.height + 2;
            selfDiaPair.diameter = Math.max(leftDiaPair.diameter, Math.max(rightDiaPair.diameter, selfDiameter));
            return selfDiaPair;
        }
    }
}
