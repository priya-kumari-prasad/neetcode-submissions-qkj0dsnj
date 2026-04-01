class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        int[] res = new int[k];
      for(int i = 0; i<k; i++){  
        int maxFreq = -1;
        int maxKey = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() > maxFreq){
                maxFreq = entry.getValue();
                maxKey = entry.getKey();
            }
            
        }
        res[i] = maxKey;
        map.remove(maxKey);
      }
    return res;
    }
}
