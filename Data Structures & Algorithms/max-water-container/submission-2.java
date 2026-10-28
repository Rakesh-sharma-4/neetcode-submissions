class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int low = 0;
        int high = heights.length-1;
        while(high > low){
            int min = Math.min(heights[low], heights[high]);
            int area = min * (high-low);
            maxArea = Math.max(area, maxArea);
            if(heights[low] > heights[high]){
                high--;
            }else{
                low++;
            }
        }
        return maxArea;
    }
}
