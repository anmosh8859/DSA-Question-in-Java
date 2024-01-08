package dsapractice;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    class Node{
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
    private Node root;
    public boolean insertItr(int value){
        if(root == null){
            root = new Node(value);
            return true;
        }
        Node temp = root;
        while(temp.left!=null && temp.right!=null){
            if(value== temp.value) return false;
            if(value<temp.value)
                temp = temp.left;
            else temp = temp.right;
        }
        if(value < temp.value) temp.left = new Node(value);
        else temp.right = new Node(value);
        return true;
    }

    public void insertRec(int value){
        root = insertRec(root,value);
    }

    private Node insertRec(Node root, int value){
        if(root == null) return new Node(value);
        else if (value < root.value) root.left = insertRec(root.left,value);
        else if(value > root.value)root.right = insertRec(root.right,value);
        return root;
    }

    public boolean contains(int value){
        return contains(root,value);
    }

    private boolean contains(Node root, int value){
        if(root == null) return false;
        if(root.value==value) return true;
        if(value<root.value) return contains(root.left,value);
        else return contains(root.right,value);
    }

    public void delete(int value){
        System.out.println(delete(root, value).value);
    }
    private Node delete(Node root, int value){
        if(root == null) return root;
        else if(value < root.value) root.left =  delete(root.left,value);
        else if (value > root.value) root.right = delete(root.right,value);
        else{
            if(root.left == null) return root.right;
            else if (root.right==null) return root.left;
            root.value = findMin(root.right);
            root.right = delete(root.right, root.value);
        }
        return root;
    }

    private int findMin(Node root) {
        if(root.left==null) return root.value;
        return findMin(root.left);
    }

    public int noOfLeafNodes(){
        return noOfLeafNodes(root,0);
    }

    private int noOfLeafNodes(Node root, int i) {
        if(root == null)return i;
        if(root.left == null && root.right == null) return 1;
        return noOfLeafNodes(root.left,i) + noOfLeafNodes(root.right,i);
    }

    public void bfs(){
        System.out.print("BFS: ");
        Queue<Node> q = new LinkedList<>();
        Node temp = root;
        q.add(temp);
        while (!q.isEmpty()){
            if(q.peek().left!=null) q.add(q.peek().left);
            if(q.peek().right!=null) q.add(q.peek().right);
            Node curr = q.poll();
            System.out.print(curr.value + " ");
        }
        System.out.println();
    }

    public class DFS{
        public void preOrder(){
            System.out.print("Pre Order: ");
            preOrder(root);
            System.out.println();
        }

        private void preOrder(Node temp) {
            if(temp!=null){
                System.out.print(temp.value + " ");
                preOrder(temp.left);
                preOrder(temp.right);
            }
        }

        public void inOrder(){
            System.out.print("In Order: ");
            inOrder(root);
            System.out.println();
        }
        private void inOrder(Node node){
            if(node!=null){
                inOrder(node.left);
                System.out.print(node.value + " ");
                inOrder(node.right);
            }
        }
        public void postOrder(){
            System.out.print("Post Order: ");
            postOrder(root);
            System.out.println();
        }

        private void postOrder(Node temp) {
            if(temp!=null){
                postOrder(temp.left);
                postOrder(temp.right);
                System.out.print(temp.value + " ");
            }
        }
    }

    // chat GPT se liya hai method
    private void printTree(Node current, String indent, boolean isLeft) {
        if (current != null) {
            System.out.print(indent);
            if (isLeft) {
                System.out.print("├─L─ ");
                indent += "│  ";
            } else {
                System.out.print("└─R─ ");
                indent += "   ";
            }
            System.out.println(current.value);
            printTree(current.left, indent, true);
            printTree(current.right, indent, false);
        }
    }

    @Override
    public String toString() {
        if (root == null) {
            return "Tree is empty";
        }
        printTree(root, "", false);
        return "";
    }
}
