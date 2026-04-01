class Solution {
    public int longestConsecutive(int[] nums) {
     int n = nums.length;
     Arrays.sort(nums);
     int max = 0;
     for(int i = 0; i<n ; i++){
        int curr = nums[i];
        int count = 0;
        for(int j = i; j<n; j++){
            if(nums[j] == curr){
                count++;
                curr++;
            }
        }
        max = Math.max(count, max);
     }   
     return max;
    }
}
