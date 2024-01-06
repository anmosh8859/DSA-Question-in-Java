package leetcode;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
}
public class LeetCode450DeleteNodeInBST {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return root;
        if(key<root.val) root.left = deleteNode(root.left,key);
        else if(key>root.val) root.right = deleteNode(root.right,key);
        else{
            if(root.left == null) return root.right;
            else if(root.right == null) return root.left;

            root.val = findMin(root.right);
            root.right = deleteNode(root.right,root.val);
        }
        return root;
    }

    public int findMin(TreeNode root){
        if(root.left==null) return root.val;
        return findMin(root.left);
    }
}
