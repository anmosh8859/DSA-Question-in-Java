package dsapractice;

import java.util.HashMap;

public class DataStructureBigO1 {
    class Node{
        Node prev;
        Node next;
        int val;
        int min;
        int max;

        public Node(int val, int min, int max) {
            this.val = val;
            this.max = max;
            this.min = min;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    '}';
        }
    }

    Node head;
    Node tail;

    int size = 0;
    private final HashMap<Integer,Node> map;

    public DataStructureBigO1(){
        map = new HashMap<>();
    }
    public void insert(int val){
        if(map.isEmpty()){
            head = tail = new Node(val,val,val);
            map.put(val,head);
        } else{
            if(map.get(val)!=null){
                System.out.println("The " + val + "is already present...");
                return;
            }
            int min = Math.min(head.min,val);
            int max = Math.max(head.max, val);
            Node node = new Node(val,min,max);
            node.next = head;
            head.prev = node;
            head = node;
            map.put(val,head);
        }


        System.out.print("INSERT ");
        display();


    }
    public void remove(int val){

        Node node = map.get(val);
        if(node==null) return;
        Node prev = node.prev;
        Node next = node.next;
        if(prev==null && next==null) head = tail = null;
        else if(prev!=null && next!=null){
            prev.next = next;
            next.prev = prev;
        } else if (prev==null) {
            head = next;
            node.next = next.prev = null;
        } else if (next==null) {
            prev.next = node.prev = null;
            tail = prev;
        }
        if(head!=null){
            head.min = Math.min(head.min, node.min);
            head.max = Math.max(head.max, node.max);
        }
        map.remove(val);

        System.out.print("Delete: ");
        display();

    }

    private void display() {
        Node node = head;
        while (node!=null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("END");
        System.out.println(map);
    }

    public boolean search(int val){
        return map.containsKey(val);
    }

    public int getMin(){
        return head.min;
    }
    public int getMax(){
        return head.max;
    }
}
