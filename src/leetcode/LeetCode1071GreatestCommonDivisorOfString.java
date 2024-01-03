package leetcode;

public class LeetCode1071GreatestCommonDivisorOfString {
    //slow method

    public String gcdOfStrings(String str1, String str2) {

        String large;
        String small;
        if(str1.length()>str2.length()){
            large = str1;
            small = str2;
        } else {
            large = str2;
            small = str1;
        }

        StringBuilder ans = new StringBuilder();

        int minLen = small.length();
        int maxLen = large.length();

        for(int i = 0 ; i < minLen ; i++){
            char c = str1.charAt(i);
            if(c==str2.charAt(i)){
                ans.append(c);
            }
        }

        for(int i = ans.length()-1 ; i >= 0 ; i--){
            if(minLen%(i+1)!=0 || maxLen%(i+1)!=0)
                ans.deleteCharAt(ans.length()-1);
            else break;
        }

        int ansLen = ans.length();
        for(int i = 0 ; ansLen>0 && i < maxLen ; i+=ansLen){
            if(!ans.toString().equals(large.substring(i,i+ansLen))) {
                i = 0;
                ans.deleteCharAt(ansLen-1);
                ansLen--;
            }

            if((i+ansLen)<=minLen){
                if(!ans.toString().equals(small.substring(i,i+ansLen))) {
                    i = 0;
                    ans.deleteCharAt(ansLen-1);
                    ansLen--;
                }
            }
        }
        return ans.toString();
    }

}
