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
    public void recReverseLL(){
//        if(head == null || head.next == null) return;
//        recReverseLL(head,getNodeAt(getSize()));
        head = reverseRec(head);
    }

//    private void recReverseLL(Node head, Node tail) {
//        if(head == tail){
//            head = tail;
//            return;
//        }
//
//        recReverseLL(head.next, tail);
//    }
    private Node reverseRec(Node head) {
        if(head == null) {
            return head;
        }

        // last node or only one node
        if(head.next == null) {
            return head;
        }

        Node newHeadNode = reverseRec(head.next);

        // change references for middle chain
        head.next.next = head;
        head.next = null;
        display(newHeadNode);

        // send back new head node in every recursion
        return newHeadNode;
    }

    public void reverseItter(){
        head = reverseItter(head);
    }

    private Node reverseItter(Node head){
        if(head == null || head.next==null) return head;
        Node prev = null;
        Node curr = head;
        Node next = head.next;
        while(next!=null){
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next.next;
        }
        curr.next = prev;
        head = curr;
        return head;
    }

    public void reverseBetween(int left, int right){
        reverseBetween(head, left, right);
    }

    private void reverseBetween(Node head, int left, int right){
        if(head == null || head.next == null || left>=right) return;
        int size = getSize();
        if(left<1) left = 1;
        if(right>size) right = size;

        Node prevLeft = getNodeAt(left-1);
        Node nextRight = getNodeAt(right+1);

        Node prev = prevLeft;
        Node curr = getNodeAt(left);
        Node next = curr.next;
        Node headTemp = curr;

        while(next!=nextRight){
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next.next;
        }
        curr.next = prev;
        if(prevLeft!=null) prevLeft.next = curr;
        else this.head = curr;
        headTemp.next = nextRight;
    }

    public LinkedList addTwoDigits(LinkedList l){
        return new LinkedList(addTwoDigits(this.head,l.head));
    }

    private Node addTwoDigits(Node l1, Node l2) {
        int carry = 0;
        Node lSave;
        Node head;
        int t = l1.data + l2.data + carry;
        carry = t/10;
        head = lSave = new Node(t%10);
        l1 = l1.next;
        l2 = l2.next;
        while(l1!=null&&l2!=null){
            t = l1.data + l2.data + carry;
            carry = t/10;
            lSave.next = new Node(t%10);
            lSave = lSave.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null){
            t = l1.data + carry;
            carry = t/10;
            lSave.next = new Node(t%10);
            lSave = lSave.next;
            l1 = l1.next;
        }

        while(l2!=null){
            t = l2.data + carry;
            carry = t/10;
            lSave.next = new Node(t%10);
            lSave = lSave.next;
            l2 = l2.next;
        }
        if(carry!=0){
            lSave.next = new Node(carry);
        }
        return head;
    }
}