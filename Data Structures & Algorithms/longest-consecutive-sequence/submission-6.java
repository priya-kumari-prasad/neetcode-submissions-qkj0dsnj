class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int n: nums){
            set.add(n);
        }
        int longest = 0;
        for(int n: nums){
            if(!set.contains(n-1)){
                int curr = n;
                int count = 1;
                while(set.contains(curr+1)){
                    count++;
                    curr++;
                }
                longest = Math.max(count, longest);
            }
        }
        return longest;
    }
}
