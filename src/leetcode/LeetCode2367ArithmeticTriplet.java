package leetcode;

public class LeetCode2367ArithmeticTriplet {
    public int arithmeticTriplets(int[] nums, int diff) {
        int total = 0;
        for(int i = 0; i < nums.length-2 ; i++){
            int  j = i+1;
            int k = nums.length-1;
            while((j<k) && (nums[j] - nums[i] != diff)){
                j++;
            }
            while((k>j) && (nums[k] - nums[j] != diff)){
                k--;
            }
            if((nums[j] - nums[i] == diff) && (nums[k] - nums[j] == diff)){
                total++;
            }
        }
        return total;
    }
}
