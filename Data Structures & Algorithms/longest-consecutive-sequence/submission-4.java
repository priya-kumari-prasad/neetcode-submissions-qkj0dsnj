class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        for(int i = 0; i<nums.length;i++){
            int curr = nums[i];
            int cons = 0;
            while(set.contains(curr)){
                curr++;
                cons++;
            }
            max = Math.max(cons, max);
        }
        return max;
    }
}
