import collection.CollectionDriver;
import dsapractice.Combinations;
import dsapractice.DSADriver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    void inc(Integer i){
        i=5;
    }

    public static void main(String[] args) /*throws IOException*/ {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        String a = bf.readLine();
//        String b = bf.readLine();
//        LargeIntegerSum lis = new LargeIntegerSum();
//        lis.lis(a,b);

//        int [] arr  = {4,-4,2,4,3};
//        RotateArray.intermediateArray(arr,3);
//        RotateArray.bubbleRotate(arr,3);
//        RotateArray.reverseRotate(arr,3);
//        QuickSort.quickSort(arr);
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
//        int [] plants = {2,3,5,9,64};
//        System.out.println(new leetcode.LeetCode2105WateringThePlants().minimumRefill(plants,4,5));
//        System.out.println(new leetcode.LeetCode2367ArithmeticTriplet().arithmeticTriplets(arr,3));
//        System.out.println(new leetcode.LeetCode2475NumberOfUnequalTriplet().unequalTriplets(arr));
//        System.out.println(new leetcode.LeetCode163SumClosest().threeSumClosest(arr,4));
//        Stack<Integer> stack = new Stack<>();
//        stack.push(5);
//        stack.push(4);
//        Collections.sort(stack);
//        System.out.println(stack);
//        BinarySearchTree bst = new BinarySearchTree();
//        bst.insert(47);
//        bst.insert(21);
//        bst.insert(76);
//        bst.insert(18);
//        bst.insert(52);
//        bst.insert(82);
//        System.out.println(bst.contains(18));
//        System.out.println(bst.contains(22));
//        System.out.println(bst);
//        String s ="";
//        System.out.println("Total no. of leaf nodes: " + bst.noOfLeaf());
//        Graph g = new Graph();
//
//        g.addVertex("A");
//        g.addVertex("B");
//        g.addVertex("C");
//        g.addVertex("D");
//
//        g.addEdge("A","B");
//        g.addEdge("A","C");
//        g.addEdge("A","D");
//        g.addEdge("B","D");
//        g.addEdge("C","D");
//
//        System.out.println(g);
//
//        g.removeVertex("D");
//
//        g.removeEdge("A","B");
//        System.out.println(g);


//        System.out.println(new leetcode.LeetCode5LongestPalindromeSubstring().longestPalindrome("acbbba"));

//        HeapDriver.heapDriver();
//        LeetCodeDriver.leetCodeDriver();

//        DSADriver.driver();

//        CollectionDriver.driver();

//        OOPsDriver.driver();

//        int[] nums1 = {1,2,3};
//        int [] nums2 = {2,4,6};
//        HashSet<Integer> set1 = new HashSet<>(Arrays.stream(nums1).boxed().collect(Collectors.toList()));
//        HashSet<Integer> set2 = new HashSet<>(Arrays.stream(nums2).boxed().collect(Collectors.toList()));
//        System.out.println(set1);
//        System.out.println(set2);
//        List<List<Integer>>  li = new ArrayList<>();
//        li.add(set1.stream().filter(num -> !set2.contains(num)).collect(Collectors.toList()));
//        li.add(set2.stream().filter(num -> !set1.contains(num)).collect(Collectors.toList()));
//        System.out.println(li);
        System.out.println(Combinations.combinations(27,8));
    }
}