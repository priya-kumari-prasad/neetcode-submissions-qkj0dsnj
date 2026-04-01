class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int majority = nums[n/2];
        
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == majority){
                count++;
                
            }
        }
        if(count >= n/2){
            return majority;
        }
        return -1;
    }
}