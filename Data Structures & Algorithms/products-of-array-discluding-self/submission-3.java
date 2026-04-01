class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int product = 1;  
        int count0 = 0;
        // int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            if(nums[i] == 0){
                count0++;
            }
            else{
                product *= nums[i];
            }
        }
        if(count0 > 1){
            Arrays.fill(nums,0);
            return nums;
        }

        if(count0 == 1){
            for(int i = 0; i<n; i++){
                nums[i] = (nums[i] == 0) ? product : 0;
            }
        }
        else{
            for(int i = 0; i<n; i++){
                nums[i] = product/nums[i];
            }
        }
        return nums;
    }
}  
