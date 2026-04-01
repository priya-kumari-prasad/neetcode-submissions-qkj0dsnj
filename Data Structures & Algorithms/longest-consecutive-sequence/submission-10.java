class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int max = 0;
        for(int i : set){
            if(!set.contains(i-1)){
                int curr = i;
                int count = 0;
                while(set.contains(curr)){
                    curr++;
                    count++;
                }
                max = Math.max(count, max);
            }
        }
        return max;
    }
}
