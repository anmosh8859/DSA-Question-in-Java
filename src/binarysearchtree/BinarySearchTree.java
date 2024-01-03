package binarysearchtree;

public class BinarySearchTree {
    Node root;

    class Node{
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public boolean insert(int value){
        Node newNode = new Node(value);
        if(root==null) root = newNode;
        Node temp = root;
        while(true){
            if(value == temp.val) return false;
            if(value<temp.val){
                if(temp.left==null){
                    temp.left = newNode;
                    return true;
                }else temp = temp.left;
            } else {
                if(temp.right==null){
                    temp.right = newNode;
                    return true;
                } else temp = temp.right;
            }
        }
    }

    public boolean contains(int value){
        if(root==null) return false;
        Node temp = root;

        while (temp!=null){
            if(value<temp.val) temp = temp.left;
            else if (value>temp.val) temp = temp.right;
            else return true;
        }
        return false;
    }

    public int noOfLeaf(){
        return noOfLeaf(root,0);
    }
    private int noOfLeaf(Node root, int count){
        if(root.left == null) return ++count;
        else if(root.right == null) return ++count;
        else return noOfLeaf(root.left,count) + noOfLeaf(root.right, count);
    }

    @Override
    public String toString() {
//        int leftIndent = 0;
//        StringBuilder st = new StringBuilder();
//        Node temp = root;
//        while()
        return "BinarySearchTree{" +
                "root=" + root.val +
                '}';
    }
}
