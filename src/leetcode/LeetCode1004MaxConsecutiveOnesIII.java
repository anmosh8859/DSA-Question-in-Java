package leetcode;

public class LeetCode1004MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int maxCount = 0;
        int l = nums.length;
        int i = 0;
        int j = -1;
        for(int f=k ; j+1<l && f>0 ;){
            if(nums[j+1]==0){
                f--;
                j++;
            } else j++;
        }
        maxCount = j-i;
        while(i< l && j+1< l){
            if(nums[j+1]==1){
                j++;
            } else {
                j++;
                while(nums[i]==1){
                    i++;
                } i++;
            }
            if((j-i)>maxCount) maxCount = j-i;
        }
        return maxCount+1;
    }
}
