class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<nums.length;i++){
            if(nums[i] != val){
                list.add(nums[i]);
            }
        }
        int k = 0;
        for(int i = 0; i<list.size(); i++){
            nums[k++] = list.get(i);
        }
        return k;
    }
}