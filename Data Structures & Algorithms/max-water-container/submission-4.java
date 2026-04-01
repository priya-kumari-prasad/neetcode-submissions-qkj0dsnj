class Solution {
    public int maxArea(int[] heights) {
        if(heights == null || heights.length < 2){
            return 0;
        }
        int i = 0; int j = heights.length-1;
        int maxArea = 0;
        while(i < j){
            int height = Math.min(heights[i], heights[j]);
            int width = j-i;
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
            if(heights[i] < heights[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxArea;
    }
}
