class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        int n = nums.length;
        for(int i = 0; i<n; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int count = 1;
            int curr = nums[i];
            for(int j = i+1; j<n; j++){
                if(j > i && nums[j] == nums[j-1]) continue;
                if(curr == nums[j]-1){
                    count++;
                    curr++;
                }
            }
            max = Math.max(count, max);
        }
        return max;
    }
}
