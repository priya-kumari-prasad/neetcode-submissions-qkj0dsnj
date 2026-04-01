class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prod = 1;
        int count = 0;
        int res[] = new int[n];
        for(int i = 0; i<n ; i++){
            if(nums[i] == 0){
                count++;
            }
            else{
                prod *= nums[i];
            }
        }
        if(count >= 2){
            Arrays.fill(res, 0);
            return res;
        }
        for(int i = 0; i<n; i++){
            if(count == 1){
            res[i] = (nums[i] == 0)?prod: 0;
            }
            else{
                res[i] = prod/nums[i];
            }
        }
        return res;
    }
}  
