package linkedlist;

public class LinkedList {
    private class Node {
        Node next;
        Integer data;

        public Node() {}

        public Node(Integer data) {
            this.data = data;
        }

        public Node(Node next, Integer data) {
            this.next = next;
            this.data = data;
        }
    }
    private Node head;

    public LinkedList() {}

    public LinkedList(Node head) {
        this.head = head;
    }

    public void insertLast(Integer data){
        if(head == null){
            head = new Node(data);
            return;
        }
        Node node = head;
        while(node.next != null){
            node = node.next;
        }
        node.next = new Node(data);
    }
    public void insertFirst(Integer data){
        if(head == null) head = new Node(data);
        Node node = new Node(data);
        node.next = head;
        head = node;
    }
    public void display(){
        display(head);
    }

    private void display(Node node){
        while(node != null){
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("END");
    }
    public LinkedList mergeTwoSortedLinkedList(LinkedList l1, LinkedList l2){
        Node temp1 = l1.head;
        Node temp2 = l2.head;
        return new LinkedList(mergeTwoSortedLinkedList(temp1,temp2));
    }
    public Node mergeTwoSortedLinkedList(Node temp1,Node temp2){
        LinkedList ans = new LinkedList();
        Node ansTemp = ans.head;


        while (temp1!=null && temp2!=null){

            if(temp1.data<=temp2.data){

                if(ansTemp == null) ans.head = ansTemp = temp1;

                else ansTemp = ansTemp.next = temp1;

                temp1 = temp1.next;

            } else{

                if(ansTemp==null) ans.head = ansTemp = temp2;

                else ansTemp = ansTemp.next = temp2;

                temp2 = temp2.next;

            }

        }
        if(ansTemp==null) ansTemp = temp1 != null ? temp1 : temp2;
        else ansTemp.next = temp1 != null ? temp1 : temp2;
        return ans.head;
    }
    public Node getMidNode(Node head){
        Node slow;
        slow = null;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow==null ? head : slow.next;
            fast = fast.next.next;
        }
        Node ans = slow.next;
        slow.next = null;
        return ans;
    }

    public void mergeSort(){
        head = mergeSort(head);
    }
    private Node mergeSort(Node head){
        if(head == null || head.next == null) return head;
        Node mid = getMidNode(head);
        Node left = mergeSort(head);
        Node right = mergeSort(mid);
        return mergeTwoSortedLinkedList(left,right);
    }

    public void swapNode(int first, int second){
        swapNode(getNodeAt(first - 1), getNodeAt(first), getNodeAt(first + 1),getNodeAt(second - 1),getNodeAt(second),getNodeAt(second + 1));
    }

    private void swapNode(Node prevFirst, Node first, Node firstNext, Node prevSec, Node second, Node secondNext){
        if(prevFirst!=null) prevFirst.next = second;
        else head = second;

        first.next = secondNext;

        if(prevSec!=first) prevSec.next = first;

        if(firstNext!=second) second.next = firstNext;
        else second.next = first;

    }

    public int getSize(){
        return getSize(head);
    }
    private int getSize(Node head){
        int count = 0;
        while(head!=null){
            head = head.next;
            count++;
        }
        return count;
    }

    public int dataAt(int num){
        return getNodeAt(num).data;
    }

    private Node getNodeAt(int num){
        int size = getSize();
        Node node = head;
        if(num>size || num < 1) return null;
        for (int i = 1; i < num; i++) {
            node = node.next;
        }
        return node;
    }

    public void bubbleSort(){
        bubbleSort(getSize(),1);
    }

    public void bubbleSort(int row, int col){
        if(row == 0) return;
        if(col < row){
            Node first = getNodeAt(col);
            Node second = getNodeAt(col + 1);
            if(first.data> second.data){
                swapNode(col, col+1);
                display();
            }
            bubbleSort(row,col+1);
        } else{
            bubbleSort(row - 1,1);
        }
    }
}