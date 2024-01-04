package dsapractice;

public class Driver {
    public static void driver(){
//        LinkedList ll = new LinkedList();
//        System.out.println(ll);
//        ll.insertLast(0);
//        ll.insertLast(1);
//        ll.insertLast(2);
//        ll.insertLast(3);
//        ll.insertLast(4);
//        ll.insertLast(5);
//        System.out.println(ll.removeNode(1));
//        System.out.println(ll.search(0));
//        System.out.println(ll);

        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(52);
        bst.insert(82);
        bst.insert(27);

        System.out.println(bst);
        BinarySearchTree.DFS dfs = bst.new DFS();
        dfs.preOrder();
        dfs.inOrder();
        dfs.postOrder();
        bst.bfs();
    }
}
