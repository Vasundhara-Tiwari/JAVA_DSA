package Tree;

public class ConstructTreeUsingInorderAndPreorder {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return Create(preorder, inorder, 0, inorder.length - 1, 0, preorder.length - 1);
    }

    public TreeNode Create(int[] pre, int[] in, int ilo, int ihi, int plo, int phi) {
        if(ilo > ihi || plo > phi){
            return null;
        }
        TreeNode node = new TreeNode(pre[plo]);
        int idx = search(in, ilo, ihi, pre[plo]);
        int e = idx - ilo;
        node.left = Create(pre, in, ilo, idx - 1, plo + 1, plo + e);
        node.right = Create(pre, in, idx + 1, ihi, plo + e + 1, phi);
        return node;
    }
    public int search(int[] in, int low, int high, int item){
        for(int i = low; i <= high; i++){
            if(in[i] == item){
                return i;
            }
        }
        return -1;
    }
}