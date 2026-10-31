class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] maxLeft = new int[n];
        int[] maxRight = new int[n]; 
        int max = Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i< n ;i++){
            max = Math.max(max, height[i]);
            maxLeft[i]= max;
        }
        max = 0;
        for(int i = n-1;i >= 0 ;i--){
            max = Math.max(max, height[i]);
            maxRight[i]= max;
        }
        for(int i=0;i<n ;i++){
            int min = Math.min(maxLeft[i], maxRight[i]);
            min -= height[i];
            count+=min;
        }
        return count;
    }
}
