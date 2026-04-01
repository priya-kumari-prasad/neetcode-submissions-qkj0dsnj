class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3){
            return new ArrayList<>();
        }
       List<List<Integer>> res = new ArrayList<>();
       
       HashSet<String> seen = new HashSet<>();
       for(int i = 0; i<nums.length-2;i++){
            for(int j = i+1; j<nums.length-1; j++){
                List<Integer> list = new ArrayList<>();
                for(int k = j+1; k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k] == 0){
                        int a = nums[i];
                        int b = nums[j];
                        int c = nums[k];
                        int[] temp = new int[]{a, b, c};
                        Arrays.sort(temp);
                        String key = temp[0] + "," + temp[1] + ","+temp[2];
                        if(!seen.contains(key)){
                            seen.add(key);
                            res.add(Arrays.asList(temp[0],temp[1], temp[2]));
                            
                        }

                    }                    
                }
            }
       }
       return res;
    }
}
