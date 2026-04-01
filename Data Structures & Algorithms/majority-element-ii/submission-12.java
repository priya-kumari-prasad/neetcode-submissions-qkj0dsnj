class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length;i++){
            int curr = nums[i];
            int count = 0;
            for(int j = 0; j<nums.length;j++){
                if(nums[j] == curr){
                    count++;
                }
            }
            if(count > nums.length/3){
                set.add(curr);
            }
        }
        return new ArrayList<>(set);
    }
}