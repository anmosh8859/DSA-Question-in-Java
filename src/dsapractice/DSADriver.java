package dsapractice;

public class DSADriver {
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
//        bst.insertItr(47);
//        bst.insertItr(21);
//        bst.insertItr(76);
//        bst.insertItr(18);
//        bst.insertItr(52);
//        bst.insertItr(82);
//        bst.insertItr(27);

        bst.insertRec(47);
        bst.insertRec(21);
        bst.insertRec(76);
        bst.insertRec(18);
        bst.insertRec(52);
        bst.insertRec(82);
        bst.insertRec(27);

        System.out.println(bst);

        System.out.println("No. of Leaf Nodes: " + bst.noOfLeafNodes());

        BinarySearchTree.DFS dfs = bst.new DFS();
        dfs.preOrder();
        dfs.inOrder();
        dfs.postOrder();
        bst.bfs();

        bst.delete(47);

        dfs.preOrder();
        dfs.inOrder();
        dfs.postOrder();
        bst.bfs();

        System.out.println(bst);

        System.out.println("No. of Leaf Nodes: " + bst.noOfLeafNodes());
    }
}
