class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefSum = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        for(int n: nums){
            prefSum += n;
            int diff = prefSum - k;
            if(map.containsKey(diff)){
                count += map.get(diff);
            }
            
            map.put(prefSum, map.getOrDefault(prefSum, 0)+1);
        }
        return count;
        
    }
}