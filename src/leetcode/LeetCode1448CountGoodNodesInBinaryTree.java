package leetcode;

public class LeetCode1448CountGoodNodesInBinaryTree {
    public int goodNodes(TreeNode root) {
        return gn(root,root.val);
    }
    private int gn(TreeNode root, int highVal){
        if(root!=null){
            int val = root.val;
            TreeNode left = root.left;
            TreeNode right = root.right;
            if(val>=highVal){
                return gn(left, val) + gn(right,val) + 1;
            } else return gn(left, highVal) + gn(right,highVal);
        }
        return 0;
    }
}
