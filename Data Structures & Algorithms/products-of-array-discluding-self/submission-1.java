class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int mult = 1;
        int count = 0;
        for(int i = 0; i<n; i++){
            if(nums[i] != 0){
                mult *= nums[i];
            }   
            else{
                count++;
            }
        }  
        if(count > 1){return temp;}
        for(int i = 0; i<n; i++){
            if(count >0){
                temp[i] = (nums[i] == 0)? mult : 0;
            }
            else{
                temp[i] = mult/nums[i]; 
            }    
        }
        return temp;
    }
}  
