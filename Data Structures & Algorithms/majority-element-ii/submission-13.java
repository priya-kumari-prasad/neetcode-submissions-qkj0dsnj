class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0;
        while(i < n){
            int curr = nums[i];
            int j = i;
            while(j < n){
                if(nums[j] != curr){
                    break;
                }
                j++;
            }
            int length = j-i;
            if(length > (n/3)){
                list.add(curr);
            }
            i = j;
        }
        return list;
    }
}