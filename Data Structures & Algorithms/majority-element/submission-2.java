class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums[0];
        int count = 1;
        for(int i = 1 ;i<nums.length;i++){
            if(count == 0){
                majority = nums[i];
                count = 1;
            }
            else if(nums[i] == majority){
                count++;
            }
            else{
                count--;
            }
        }
        int freq = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i] == majority)
            freq++;
        } 
        if(freq > nums.length/2){
            return majority;
        }
        return 0;
    }
}