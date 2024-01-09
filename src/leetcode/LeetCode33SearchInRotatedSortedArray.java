package leetcode;

// 100% Efficiency
public class LeetCode33SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (end + start)/2;
            if(nums[mid] == target) return mid;
            if(nums[start]<=nums[mid]){ //left part sorted;
                if(target<nums[mid] && target>=nums[start]) end = mid - 1;
                else start = mid + 1;
            } else { // right part sorted
                if(target<=nums[end] && target>nums[mid]) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }
}
