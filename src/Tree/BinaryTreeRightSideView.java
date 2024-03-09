package Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {
    class Solution {
        int depth = 0;
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> al = new ArrayList<>();
            rightView(root, al, 1);
            return al;
        }
        public void rightView(TreeNode root, List<Integer> al, int currentLevel){
            if(root == null){
                return;
            }
            if(currentLevel > depth){
                al.add(root.val);
                depth = currentLevel;
            }
            rightView(root.right, al, currentLevel + 1);
            rightView(root.left, al, currentLevel + 1);
        }
    }
}
