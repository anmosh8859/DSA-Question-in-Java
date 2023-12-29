import collection.GenericClass;
import linkedlist.LinkedList;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        String a = bf.readLine();
//        String b = bf.readLine();
//        LargeIntegerSum lis = new LargeIntegerSum();
//        lis.lis(a,b);

//        int [] arr  = {3,5,7,1,4,2,6};
//        RotateArray.intermediateArray(arr,3);
//        RotateArray.bubbleRotate(arr,3);
//        RotateArray.reverseRotate(arr,3);
//        QuickSort.quickSort(arr);
//        System.out.println(Arrays.toString(arr));

//        LinkedList l1 = new LinkedList();
//        l1.insertLast(1);
//        l1.insertLast(2);
//        l1.insertLast(3);
//        l1.insertLast(4);
//        l1.insertLast(9);
////
//        LinkedList l2 = new LinkedList();
//        l2.insertLast(9);
//        l2.insertLast(1);
//        l2.insertLast(5);
//        l2.insertLast(1);
//        l2.insertLast(9);

//        l2 = l2.mergeTwoSortedLinkedList(l1,l2);
//        l2.display();
//        l2.mergeSort();
//        System.out.println(l2.getSize());
//        l2.display();
//        l2.swapNode(4,5);
//        l2.bubbleSort();
//        l2.recReverseLL();
//        System.out.println(l2.isPalindrome());
//        l2.display();
//        ans.display();

//        l2.reverseItter();
//        l2.reverseBetween(0,5);
//        LinkedList l3 = l1.addTwoDigits(l2);
//        l3.display();
//        System.out.println(l3.isPalindrome());
//        HappyNumber hn = new HappyNumber();
//        hn.happyNumber(10);

//        GenericClass<Integer> gen = new GenericClass<>();
//        gen.add(5);
//        gen.add(7);
//        System.out.println(gen);
//        LambdaExpressionTest let = new LambdaExpressionTest();
//        let.sumOfOddNumber_Usual();
//        let.sumOfOddNumber_FunctionalProgramming();
//        int [] nums1 = {1,2};
//        int [] nums2 = {3,4};
//        FindMedian fm = new FindMedian();
//        System.out.println(fm.findMedianSortedArrays(nums1,nums2));
//        String s = "pwwkew";
//        System.out.println(new LengthOfLongestSubstring().lengthOfLongestSubstring(s));
        int [] plants = {2,3,5,9,64};
        System.out.println(new LeetCode2105WateringThePlants().minimumRefill(plants,4,5));
    }
}