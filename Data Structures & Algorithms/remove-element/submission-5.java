class Solution {
    public int removeElement(int[] nums, int val) {
       List<Integer> list = new ArrayList<>();
       int count = 0;
       for(int n: nums){
        if(n == val){
            count++;
        }
        else{
            list.add(n);
        }
       }
       
       for(int i = 0; i<nums.length-count;i++){
        nums[i] = list.get(i);
       }
       return list.size(); 
    }
}