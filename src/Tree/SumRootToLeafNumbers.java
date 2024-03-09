package Tree;

public class SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {
        return result(root.left, 0);
    }
    public static int result(TreeNode root, int currentSum){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return currentSum * 10 + root.val;
        }
        int left = result(root.left, currentSum*10+root.val);
        int right = result(root.right, currentSum*10+root.val);
        return left + right;
    }
}
