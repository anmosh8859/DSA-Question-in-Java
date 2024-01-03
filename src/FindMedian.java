public class FindMedian {
    public int[] merge(int[] nums1, int[] nums2){

        int mergedLen = nums1.length + nums2.length;
        int [] merged = new int[mergedLen];
        int i = 0, j = 0, count = 0;
        while(count<mergedLen){
            if(i<nums1.length && j<nums2.length) merged[count++] = nums1[i]<nums2[j] ? nums1[i++] : nums2[j++];
            else if(i < nums1.length) merged[count++] = nums1[i++];
            else merged[count++] = nums2[j++];
        }
        return merged;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] merged = merge(nums1, nums2);
        int len = merged.length;
        if(len%2==0) return ((double)merged[len/2] + (double)merged[len/2 - 1])/2;
        else return merged[len/2];
    }
}