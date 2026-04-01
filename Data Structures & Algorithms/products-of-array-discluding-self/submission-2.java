class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int temp[] = new int[n];
        for(int i = 0; i<n; i++){
            int product = 1;
            for(int j = 0; j<n;j++){
                if(i != j){
                    product *= nums[j];
                }
            }
            temp[i] = product;
        }
        return temp;
    }
}  
