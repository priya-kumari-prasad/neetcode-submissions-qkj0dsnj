class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String prefix = strs[0];
        int n = strs.length;
        int j = 0;
        while(j< Math.min(prefix.length(), strs[n-1].length())){
            if(prefix.charAt(j) != strs[n-1].charAt(j)){
                break;
            }
            j++;
        }

        return prefix.substring(0, j);
    }
}