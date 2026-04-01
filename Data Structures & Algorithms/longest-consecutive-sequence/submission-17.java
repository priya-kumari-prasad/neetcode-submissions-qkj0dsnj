class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = 0;
        for(int num: nums){
            set.add(num);
        }
        for(int i = 0; i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int curr = nums[i];
                int count = 0;
                while(set.contains(curr)){
                    count++;
                    curr++;
                }
                max = Math.max(count, max);
            }
            
        }
        return max;
    }
}
