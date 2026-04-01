class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i<n; i++){
            indices.put(nums[i], i);
        }

        for(int i = 0; i<n; i++){
            int diff = target - nums[i];
            if(indices.containsKey(diff) && indices.get(diff) != i){
                return new int[]{i, indices.get(diff)};
            }
        }
        return new int[0];
    }
}
