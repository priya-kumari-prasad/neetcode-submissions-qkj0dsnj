class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s: strs){
            char[] freq = new char[26];
            for(char ch: s.toCharArray()){
              freq[ch-'a']++;  
            }
            String hashCode = Arrays.toString(freq);
            map.putIfAbsent(hashCode, new ArrayList<>());
            map.get(hashCode).add(s);           
        }
        return new ArrayList<>(map.values());
    }
}
