class Solution {
    public int maxArea(int[] heights) {
        int maxCapacity = -1;
        int n = heights.length;
        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                int capacity = Math.min(heights[j], heights[i]) * (j-i);
                maxCapacity = Math.max(capacity, maxCapacity);
            }
        }
        return maxCapacity;
    }
}
