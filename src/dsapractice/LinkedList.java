package dsapractice;

public class LinkedList {
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    Node head;
    int size;

    public void insertLast(int data){
        if(head==null){
            head = new Node(data);
            size++;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = new Node(data);
        size++;
    }

    public void insertfirtst(int value){
        if(head==null) {
            head = new Node(value);
            size++;
            return;
        }
        Node temp = new Node(value);
        size++;
        temp.next = head;
        head = temp;
    }

    public Integer removeNode(int index){
        if (index>=size) return null;
        Node temp = head;
        if(index==0){
            int value = head.data;
            head = head.next;
            return value;
        }
        while(--index > 0){
            temp = temp.next;
        }
        int value = temp.next.data;
        temp.next = temp.next.next;
        return value;
    }

    public int search(int value){
        int index = 0;
        Node temp = head;
        while (temp!=null){
            if(temp.data==value) return index;
            temp = temp.next;
            index++;
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Linked List: ");
        Node temp = head;
        while (temp!=null){
            str.append(temp.data + " -> ");
            temp = temp.next;
        }
        str.append("NULL");
        return str.toString();
    }
}
