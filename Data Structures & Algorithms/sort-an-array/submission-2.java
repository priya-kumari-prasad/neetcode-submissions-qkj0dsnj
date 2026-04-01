class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        for(int i = 1; i<n; i++){
            for(int j = i-1; j>=0; j--){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }
}