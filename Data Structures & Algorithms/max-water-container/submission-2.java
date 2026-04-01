class Solution {
    public int maxArea(int[] heights) {
        int maxWater = 0;
        for(int i = 0; i<heights.length-1;i++){
            for(int j = i+1; j<heights.length;j++){
                int height = Math.min(heights[i], heights[j]);
                int currWater = height * (j-i);
                maxWater = Math.max(currWater, maxWater);
            }
        }
        return maxWater;
    }
}
