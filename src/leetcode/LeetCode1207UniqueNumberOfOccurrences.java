package leetcode;

import java.util.*;
import java.util.stream.IntStream;


// 1 <= arr.length <= 1000
//-1000 <= arr[i] <= 1000

//Improve the solution for the time complexity acc to constraints...
public class LeetCode1207UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Arrays.stream(arr).forEach(num-> {
            if (map.containsKey(num)) {
                map.put(num,map.get(num)+1);
            } else map.put(num,0);

        });

        Set<Integer> s = new HashSet<>();
        for(int num: map.values()){
            if(s.contains(num)) return false;
            else s.add(num);
        }
        return true;

    }

    public static void main(String[] args) {
        int [] arr = {1,2};
        System.out.println(new LeetCode1207UniqueNumberOfOccurrences().uniqueOccurrences(arr));
    }
}