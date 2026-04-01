class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        String prefix = strs[0];
        for(int i = 0; i<Math.min(strs[0].length(), prefix.length());i++){
            for(String s: strs){
                if( i == s.length() || prefix.charAt(i) != s.charAt(i)){
                    return s.substring(0, i);
                }
            }            
        }
        return prefix;
    }
}