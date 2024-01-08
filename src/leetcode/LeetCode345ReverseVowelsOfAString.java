package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode345ReverseVowelsOfAString {
    public void swap(char [] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public String reverseVowels(String s) {
        Character [] ch = {'a','e','i','o','u','A','E','I','O','U'};
        Set<Character> set = new HashSet<>(Set.of(ch));
        char [] se = s.toCharArray();
        int i = 0;
        int j = se.length-1;
        while(i<j){

            while(!set.contains(se[i]) && i<j){
                i++;
            }

            while(!set.contains(se[j]) && i<j){
                j--;
            }

            swap(se,i,j);
            i++;j--;
        }
        return String.valueOf(se);
    }
}