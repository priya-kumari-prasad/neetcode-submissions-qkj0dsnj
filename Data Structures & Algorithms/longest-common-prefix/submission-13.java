class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return null;
        }
        if(strs.length == 1){
            return strs[0];
        }
        String prefix = strs[0];
        for(int i = 1; i<strs.length;i++){
            for(int j = 0; j<Math.min(strs[i].length(), prefix.length());j++){
                if(prefix.charAt(j)!= strs[i].charAt(j)){
                    prefix = prefix.substring(0,j);
                }
            }
            if(strs[i] == "" || strs[i].length() == 0){
                return "";
            }
            prefix = prefix.substring(0, Math.min(prefix.length(), strs[i].length()));
        }
        return prefix;
    }
}