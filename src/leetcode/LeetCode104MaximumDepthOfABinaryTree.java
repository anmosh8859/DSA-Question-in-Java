package leetcode;

public class LeetCode104MaximumDepthOfABinaryTree {
    public int maxDepth(TreeNode root) {
        if(root!=null){
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return Math.max(left,right)+1;
        }else return 0;
    }
}
