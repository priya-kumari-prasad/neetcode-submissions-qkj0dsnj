class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        String prefix = strs[0];
        for(int i = 0; i<strs.length; i++){
            
            int j;
            for(j = 0; j<Math.min(prefix.length(),strs[i].length()); j++){
              if(strs[i].charAt(j) != prefix.charAt(j)){
                break;
              }  
            }
            prefix = prefix.substring(0,j);   

            if(prefix.isEmpty()){
                return "";
            }

        }
        return prefix;
    }
}