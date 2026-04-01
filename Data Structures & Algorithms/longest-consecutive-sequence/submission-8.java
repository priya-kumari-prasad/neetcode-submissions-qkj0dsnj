class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n: nums){
            set.add(n);
        }
        int max = 0;
        for(int num: nums){
            int curr = num;
            int count = 0;
            while(set.contains(curr)){
                curr++;
                count++;
            }
            max = Math.max(count, max);
        }
        return max;
    }
}
