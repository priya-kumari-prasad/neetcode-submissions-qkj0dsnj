class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int count = 0, curr = nums[0];
        int res = 0;
        int i = 0;
        while(i < nums.length){
            if(nums[i] != curr){
                curr = nums[i];
                count = 0;
            }
            while(i<nums.length && nums[i] == curr){
                i++;
            }
            count++;
            curr++;
            res = Math.max(res, count);
        }
        return res;
    }
}
