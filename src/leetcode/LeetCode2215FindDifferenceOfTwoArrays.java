package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCode2215FindDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.stream(nums1).boxed().collect(Collectors.toList()));
        HashSet<Integer> set2 = new HashSet<>(Arrays.stream(nums2).boxed().collect(Collectors.toList()));
        List<List<Integer>>  li = new ArrayList<>();
        li.add(set1.stream().filter(num -> !set2.contains(num)).collect(Collectors.toList()));
        li.add(set2.stream().filter(num -> !set1.contains(num)).collect(Collectors.toList()));
        return li;
    }
}
