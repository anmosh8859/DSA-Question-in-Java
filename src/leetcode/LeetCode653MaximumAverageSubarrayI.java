package leetcode;

public class LeetCode653MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        int l = nums.length;
        if(l<k) return 0;
        int i = 0;
        int j = i + k - 1;
        int maxSum = 0;
        for(int m = 0 ; m < k ; m++) maxSum += nums[m];
        int sum = maxSum;
        while(j+1<l){
            sum -= (nums[i++]);
            sum += (nums[++j]);
            if(sum>maxSum) maxSum = sum;
        }
        return maxSum/(double)(k);
    }
}
