class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num: nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }

        int[] res = new int[k];
        for(int i = 0; i<k; i++){
            int maxFreq = 0;
            int maxKey = 0;

            for(int key: freq.keySet()){
                if(freq.get(key) > maxFreq){
                    maxFreq = freq.get(key);
                    maxKey = key;
                }
            }
            res[i] = maxKey;
            freq.remove(maxKey);
        }
        return res;
    }
}
