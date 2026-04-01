class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        for(int i = 0; i<nums.length;i++){
            int curr = nums[i];
            int count = 1;
            for(int j = i+1; j<nums.length;j++){
                if(curr == nums[j]-1){
                    count++;
                    curr++;
                }
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
