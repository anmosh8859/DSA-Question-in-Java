package leetcode;


// 100% Memory Efficient
public class LeetCode238ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int [] ans = new int [nums.length];
        int right = nums[nums.length-1];
        ans[0] = 1;
        for(int i = 1 ; i < nums.length ; i++){
            ans[i] = ans[i-1]*nums[i-1];
        }
        
        for(int i = nums.length-2 ; i>=0 ; i--){
            ans[i] = right*ans[i];
            right *= nums[i];
        }
        return ans;
    }
}
