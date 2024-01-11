package leetcode;

import java.util.ArrayList;
import java.util.Stack;

public class LeetCode872LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> set1 = new ArrayList<>();
        ArrayList<Integer> set2 = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();


        stack.push(root1);
        while(!stack.empty()){
            TreeNode curr = stack.pop();
            if(curr.left==null && curr.right==null) set1.add(curr.val);
            if(curr.left!=null) stack.push(curr.left);
            if(curr.right!=null) stack.push(curr.right);
        }

        stack.push(root2);
        while(!stack.empty()){
            TreeNode curr = stack.pop();
            if(curr.left==null && curr.right==null) set2.add(curr.val);
            if(curr.left!=null) stack.push(curr.left);
            if(curr.right!=null) stack.push(curr.right);
        }

        if(set1.size()!=set2.size()) return false;
        int size = set1.size();

        for(int i = 0 ; i < size ; i++){
            if(set1.get(i) != set2.get(i)) return false;
        } return true;

    }
}
