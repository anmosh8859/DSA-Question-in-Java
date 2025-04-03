package leetcode;

public class LeetCode14LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String lcp = strs[0];
        for (String str : strs) {
            if (lcp.length() > str.length())
                lcp = str;
        }

        for (int i = 0; i < strs.length; i++) {

            if (!lcp.equals(strs[i].substring(0, lcp.length()))) {
                if (lcp.length() == 1)
                    return "";
                lcp = lcp.substring(0, lcp.length() - 1);
                i = -1;
            }
        }
        return lcp;
    }
}