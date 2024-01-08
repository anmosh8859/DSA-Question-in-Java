package leetcode;

/*
You have a long flowerbed in which some of the plots are planted, and some are not.
However, flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's,
where 0 means empty and 1 means not empty, and an integer n,
return true if n new flowers can be planted in the flowerbed
without violating the no-adjacent-flowers rule and false otherwise.



Example 1:

Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
Example 2:

Input: flowerbed = [1,0,0,0,1], n = 2
Output: false


Constraints:

1 <= flowerbed.length <= 2 * 104
flowerbed[i] is 0 or 1.
There are no two adjacent flowers in flowerbed.
0 <= n <= flowerbed.length

*/

public class LeetCode605CanPlaceFlowers {

    //98.35% memory efficient...
    public boolean canPlaceFlowers(int[] bed, int n) {
        int bedLen = bed.length;
        if(n==0) return true;
        // if(bedLen*2 < n) return false;
        for(int i = 0 ; i < bedLen ;){
            int next;
            if(i==bedLen-1) next = i;
            else next = i+1;
            if( bed[i] == 0 && bed[next] == 0){
                i+=2;
                n--;
            } else if(bed[i]==1)i+=2;
            else i++;
            if(n==0) return true;
        }
        return false;
    }
}
