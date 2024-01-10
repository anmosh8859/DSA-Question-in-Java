package leetcode;

public class LeetCode443StringCompression {
    public int compress(char[] chars) {
        int j = 0;
        StringBuilder s = new StringBuilder(chars.length);
        for(int i = 0 ; i < chars.length ; i++){
            int count = 0;
            s.append(chars[i]);
            while(i<chars.length-1 && chars[i]==chars[i+1]){
                count++;
                i++;
            }
            if(count>0) s.append(count+1);
        }
        for(int i = 0 ; i < chars.length ; i++){
            if(i<s.length()) chars[i] = s.charAt(i);
            else chars[i] = chars[chars.length-1];
        }
        return s.length();
    }
}
