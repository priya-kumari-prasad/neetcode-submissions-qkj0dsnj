class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer> store = new HashSet<>();
       int max = 0;
       for(int num: nums){
        store.add(num);
       } 

       for(int num: nums){
         int streak = 0;
         int curr = num;
         while(store.contains(curr)){
            streak++;
            curr++;
         }
         max = Math.max(max, streak); 
       }
       return max;
    }
}
