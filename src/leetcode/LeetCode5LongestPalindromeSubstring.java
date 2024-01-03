package leetcode;

public class LeetCode5LongestPalindromeSubstring {
    public boolean checkPalindromeInString(int i, int j, String s){
        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--)) return false;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        for (int length = s.length(); length > 0; length--) {
            for (int start = 0; start <= s.length() - length; start++) {
                if (checkPalindromeInString(start, start + length-1, s)) {
                    return s.substring(start, start + length);
                }
            }
        }

        return "";
    }
}
