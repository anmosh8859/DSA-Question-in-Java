package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCode1679MaxNumberOfKSumPairs {
    //method 1 bad complexity...
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        List<Integer> list = Arrays.stream(nums).filter(n->n<=k).boxed().collect(Collectors.toList());
        if(list.size()<2) return 0;
        int count = 0;
        int diff = k-list.get(0);
        list.remove(0);
        while(list.size() > 0){
            int start = 0;
            int end = list.size();
            boolean found = false;
            while(start<end){
                int mid = start + (end-start)/2;
                int midVal = list.get(mid);
                if(midVal==diff){
                    count++;
                    list.remove(mid);
                    break;
                }
                else if(diff<midVal) end = mid;
                else start = mid + 1;
            }
            if(list.size()>0) {
                diff = k-list.get(0);
                list.remove(0);
            }
        }
        return count;
    }
}
