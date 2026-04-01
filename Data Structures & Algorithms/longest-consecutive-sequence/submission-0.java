class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int maxCons = 0;
        for(int i = 0; i<n; i++){
            int consCount = 0;
            int consEle = nums[i];
            for(int j = 0; j<n; j++){
                if(nums[j] == consEle){
                    consCount++;
                    consEle += 1;
                }
            }
            maxCons = Math.max(maxCons, consCount);
        }
        return maxCons;
    }
}
