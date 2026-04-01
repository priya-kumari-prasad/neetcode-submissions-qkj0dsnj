class Solution {
    public int removeElement(int[] nums, int val) {
        // int count = 0;
        int n = nums.length;
        int i = 0;
        int j = n-1;
        while(i<j){
            if(nums[i] == val){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }
            else{
                i++;
            }
        }
        int k;
        for(k = 0; k<n; k++){
            if(nums[k] == val){
                break;
            }
        }
        return k;
    }
}