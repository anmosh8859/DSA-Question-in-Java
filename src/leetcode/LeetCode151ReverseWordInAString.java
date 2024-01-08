package leetcode;

public class LeetCode151ReverseWordInAString {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;
        int j = i;
        while (i >= 0 && j >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') i--;
            j = i;
            while (j >= 0 && s.charAt(j) != ' ') j--;
            sb.append(s.substring(j + 1, i + 1) + " ");
            i = j;
        }
        i = sb.length() - 1;
        while (i >= 0 && sb.charAt(i) == ' ') i--;
        return sb.substring(0, i + 1);
    }
}
