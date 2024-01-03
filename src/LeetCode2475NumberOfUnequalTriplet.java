public class LeetCode2475NumberOfUnequalTriplet {
    public int unequalTriplets(int[] nums) {
        int total = 0;
        for(int i = 0; i < nums.length-2 ; i++){
            for(int j = i+1 ; j < nums.length-1 ; j++){
                if(nums[i] != nums[j]){
                    for(int k = j+1 ; k < nums.length ; k++){
                        if((nums[i] != nums[k])&&(nums[j] != nums[k])) total++;
                    }
                }
            }
        }
        return total;
    }
}
