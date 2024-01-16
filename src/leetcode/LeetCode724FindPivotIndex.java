package leetcode;

public class LeetCode724FindPivotIndex {
//    Time 98% Efficient
    // public int pivotIndex(int[] nums) {
    //     int len = nums.length;
    //     int [] l = new int [len];
    //     l[0] = nums[0];
    //     int [] r = new int [len];
    //     r[len-1] = nums[len-1];

    //     for(int i = 1, j = len-2 ; i < len ; i++, j--){
    //         l[i] += l[i-1] + nums[i];
    //         r[j] += r[j+1] + nums[j];
    //         if(l[i]==r[i] && i==j) return j;
    //     }
    //     for(int i = 0 ; i < len ; i++){
    //         if(l[i]==r[i]) return i;
    //     }
    //     return -1;
    // }


    // Memory Efficient

    public int pivotIndex(int[] nums) {
        int sum = 0, leftsum = 0;
        for (int i = 0; i < nums.length; i++)
            sum = sum + nums[i];
        for (int i = 0; i < nums.length; i++) {
            if (leftsum == sum - leftsum - nums[i])
                return i;
            leftsum = leftsum + nums[i];
        }
        return -1;
    }
}
