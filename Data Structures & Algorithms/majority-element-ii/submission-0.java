class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i<n; i++){
            int count = 0; 
            for(int j = 0; j<n; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > n/3){
                set.add(nums[i]);
            }
        }
        for(int s: set){
            res.add(s);
        }
        return res;
    }
}