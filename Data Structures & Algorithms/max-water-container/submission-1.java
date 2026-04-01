class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        if(n < 1){
            return 0;
        }
        int maxCapacity = -1;
        int i = 0;
        int j = n-1;
        while(i<j){
            int capacity = Math.min(heights[i], heights[j]) * (j-i);
            maxCapacity = Math.max(capacity, maxCapacity);

            if(heights[i] < heights[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxCapacity;
    }
}
