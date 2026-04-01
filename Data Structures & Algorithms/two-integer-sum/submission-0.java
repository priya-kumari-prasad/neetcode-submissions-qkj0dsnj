class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int res[] = new int[2];
        int idx = 0;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(nums[i]+nums[j] == target){
                   res[idx++] = (i<j) ? i : j;
                   res[idx] = (j>i)?j:i;
                   return res;
                }
            }
        }
        return res;
    }
}
