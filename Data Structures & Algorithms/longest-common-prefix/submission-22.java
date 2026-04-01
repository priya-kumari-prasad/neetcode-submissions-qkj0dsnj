class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        
        for(int i = 0; i<strs[0].length(); i++){
            for(String s: strs){
                if(i == s.length() || strs[0].charAt(i) != s.charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
            
        }
        return strs[0];
    }
}