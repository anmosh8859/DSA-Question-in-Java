import java.util.Arrays;

public class LeetCode163SumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        int closestSum = 0;
        for(int i = 0 ; i < nums.length-2 ; i++){
            int j = i + 1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == target) return sum;
                else if(sum > target){
                    int diff = sum - target;
                    if(diff<minDiff){
                        minDiff = diff;
                        closestSum = sum;
                    }
                    k--;
                } else {
                    int diff = target - sum;
                    if(diff < minDiff){
                        minDiff = diff;
                        closestSum = sum;
                    }
                    j++;
                }
            }
        }
        return closestSum;
    }
}
