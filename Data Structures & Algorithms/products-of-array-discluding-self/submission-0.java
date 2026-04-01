class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        Arrays.fill(temp,1);
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i != j){
                    temp[i] *= nums[j];; 
                }
            }
        }
        return temp; 
    }
}  
