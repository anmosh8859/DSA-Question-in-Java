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
    public boolean insert(int value){
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

    public void delete(int value){

    }

    public void bfs(){
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
