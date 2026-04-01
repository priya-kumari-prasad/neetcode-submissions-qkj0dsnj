class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int []res = new int[2];
        int n = nums.length;
        for(int i = 0; i<n; i++){
            int diff = target-nums[i];
            if(map.containsKey(diff)){
                res[0] = Math.min(i, map.get(diff));
                res[1] = Math.max(i, map.get(diff));
                return res;
            }

            map.put(nums[i], i);
        }
        return null;
    }
}
