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
}