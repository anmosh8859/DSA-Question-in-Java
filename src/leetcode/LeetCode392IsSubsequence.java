package leetcode;

public class LeetCode392IsSubsequence {
    public boolean isSubsequence(String t, String s) {
        int sL = s.length();
        int tL = t.length();
        if(tL==0) return true;
        if(sL<tL) return false;
        int j = 0;
        for(char c:s.toCharArray()){
            if(c==t.charAt(j)) j++;
            if(j==tL) return true;
        }return false;
    }
}
