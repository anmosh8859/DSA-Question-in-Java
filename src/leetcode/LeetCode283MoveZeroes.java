package leetcode;

// Easy 100% Efficient
public class LeetCode283MoveZeroes {
    public void moveZeroes(int[] arr) {
        int i;
        int j = i = 0;
        int l = arr.length;
        while(i<l){
            if(arr[i]!=0) arr[j++] = arr[i];
            i++;
        }
        while(j<l) arr[j++] = 0;
    }
}
