class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        List<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue() > nums.length/3){
                res.add(entry.getKey());
            }
        }
        return res;
    }
}