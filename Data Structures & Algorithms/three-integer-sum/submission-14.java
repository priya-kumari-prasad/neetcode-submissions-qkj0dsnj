class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> res = new HashSet<>();
        for(int i = 0; i<nums.length-2;i++){
            Set<Integer> set = new HashSet<>();
            for(int j = i+1;j<nums.length;j++){
                int diff= -(nums[i]+nums[j]);
                if(set.contains(diff)){
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], diff);
                    Collections.sort(temp);
                    res.add(temp);
                }
                set.add(nums[j]);
            }
        }
        return new ArrayList<>(res);
    }
}
