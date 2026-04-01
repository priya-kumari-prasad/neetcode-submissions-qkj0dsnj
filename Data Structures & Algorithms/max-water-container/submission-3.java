class Solution {
    public int maxArea(int[] heights) {
        int i = 0; int j = heights.length-1;
        int maxWaterCapacity = 0;
        while(i < j){
            int height = Math.min(heights[i], heights[j]);
            int currentWaterCapacity = height * (j-i);
            maxWaterCapacity = Math.max(currentWaterCapacity, maxWaterCapacity);
            if(heights[i] < heights[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxWaterCapacity;
    }
}
