package leetcode;

public class LeetCode1768MergeStringsAlternately {
    public String mergeAlternately(String w1, String w2) {
        StringBuilder str = new StringBuilder();
        byte i = (byte)0;
        byte len1= (byte)w1.length();
        byte j = (byte)0;
        byte len2 = (byte)w2.length();
        byte len = len1<len2?len1:len2;
        while(len-- != 0){
            str.append(w1.charAt(i++));
            str.append(w2.charAt(j++));
        }
        if(i<len1)
            str.append(w1.substring(i,len1));
        if(j<len2)
            str.append(w2.substring(j,len2));
        return str.toString();
    }
}
