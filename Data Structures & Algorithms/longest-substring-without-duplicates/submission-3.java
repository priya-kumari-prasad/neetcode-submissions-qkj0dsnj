class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int l = 0; int res = 0;
        int r = 0;
        while(r<s.length()){
            if(mp.containsKey(s.charAt(r))){
                l = Math.max(mp.get(s.charAt(r))+1, l);
            }
            mp.put(s.charAt(r), r);
            res = Math.max(res, r-l+1);
            r++;
        }
        return res;
    }
}
