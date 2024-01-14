package leetcode;

public class LeetCode1493LongestSubarrayOf1sAfterDeletingOneElement {
    public int longestSubarray(int[] nums) {
        int l = nums.length;
        int i = 0;
        int j = -1;
        boolean zero = false;
        int maxCount = 0;
        while(!zero && j+1<l){
            if(nums[j+1]==0){
                zero=true;
            }j++;
        }
        if((nums[i]==0 || nums[j]==0) && (j-i)>maxCount) maxCount=j-i-1;
        if (j-i>maxCount) maxCount=j-i;
        while(j+1<l){
            if(nums[j+1]==0){
                while(nums[i]==1){
                    i++;
                } i++;
            } j++;
            if((nums[i]==0 || nums[j]==0) && (j-i)>maxCount) maxCount=j-i-1;
            if (j-i>maxCount) maxCount=j-i;
        }
        return maxCount;
    }
}
