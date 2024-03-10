package Tree;

public class isValidBST {

    class BSTPair{
        boolean bst = true;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
    }
    public BSTPair isBST(TreeNode root){
        BSTPair leftBSTP = isBST(root.left);
        BSTPair rightBSTP = isBST(root.right);
        BSTPair selfBSTP = new BSTPair();
        selfBSTP.max = Math.max(leftBSTP.max, Math.max(rightBSTP.max, root.val));
        selfBSTP.min = Math.min(leftBSTP.min, Math.min(rightBSTP.min, root.val));
        boolean isbst = leftBSTP.bst && rightBSTP.bst && leftBSTP.max > root.val && rightBSTP.min > root.val;
        selfBSTP.bst = isbst;
        return selfBSTP;
    }
}
