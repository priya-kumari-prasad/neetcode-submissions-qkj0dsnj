class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return null;
        }
        if(strs.length == 1){
            return strs[0];
        }
        String pref = strs[0];
        for(int i = 1; i<strs.length; i++){
            int j;
            for(j = 0; j<Math.min(strs[i].length(),pref.length());j++){
                if(pref.charAt(j) != strs[i].charAt(j)){
                    break;
                }
            }
            pref = pref.substring(0, j);
        }
        return pref;
    }
}