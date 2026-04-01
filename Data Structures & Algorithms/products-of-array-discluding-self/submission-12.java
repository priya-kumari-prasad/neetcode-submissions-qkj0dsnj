class Solution {
    public int[] productExceptSelf(int[] nums) {
        int count0 = 0;
        int prod = 1;
        int[] res = new int[nums.length];
        for(int i= 0; i<nums.length;i++){
            if(nums[i] != 0){
                prod *= nums[i];
            }
            else{
                count0++;
            }
        }
        if(count0 > 1){
            return res;
        }
        if(count0 == 1){
        for(int i = 0; i<nums.length;i++){
                if(nums[i] == 0){
                    res[i] = prod;
                }
            }
        }
        else{
            for(int i = 0; i<nums.length;i++){
                res[i] = prod / nums[i];
            }
        }       
        return res;
    }
}  
