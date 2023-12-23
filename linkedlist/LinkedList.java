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
        Node node = head;
        while(node != null){
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("END");
    }

    public static LinkedList mergeSorted(LinkedList l1, LinkedList l2){
        Node temp1 = l1.head;
        Node temp2 = l2.head;
        LinkedList ans = new LinkedList();
        while (temp1!=null && temp2!=null){
            if(temp1.data<=temp2.data){
                ans.insertLast(temp1.data);
                temp1 = temp1.next;
            } else{
                ans.insertLast(temp2.data);
                temp2 = temp2.next;
            }
        }
        while(temp1 != null){
            ans.insertLast(temp1.data);
            temp1 = temp1.next;
        }
        while(temp2 != null){
            ans.insertLast(temp2.data);
            temp2 = temp2.next;
        }
        return ans;
    }
}
