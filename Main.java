import linkedlist.LinkedList;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        String a = bf.readLine();
//        String b = bf.readLine();
//        LargeIntegerSum lis = new LargeIntegerSum();
//        lis.lis(a,b);

        int [] arr  = {3,5,7,1,4,2,6};
//        RotateArray.intermediateArray(arr,3);
//        RotateArray.bubbleRotate(arr,3);
//        RotateArray.reverseRotate(arr,3);
//        QuickSort.quickSort(arr);
//        System.out.println(Arrays.toString(arr));

        LinkedList l1 = new LinkedList();
        l1.insertLast(1);
        l1.insertLast(2);
        l1.insertLast(3);

        LinkedList l2 = new LinkedList();
        l2.insertLast(1);
        l2.insertLast(2);
        l2.insertLast(9);
        l2.insertLast(14);
        LinkedList ans = LinkedList.mergeSorted(l1,l2);
        ans.display();
    }
}