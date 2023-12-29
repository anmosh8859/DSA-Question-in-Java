import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int max = 0;
        Set<Character> set = new HashSet<>();
        for(int i = 0, j = 0 ; i < len ; i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                while(set.contains(c)){
                    set.remove(s.charAt(j));
                    j++;
                }
                set.add(c);
            } else{
                set.add(c);
                int temp = set.size();
                if(max<temp) max = temp;
            }
        }
        return max;
    }
}
