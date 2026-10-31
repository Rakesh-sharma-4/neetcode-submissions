class Solution {
    public int trap(int[] height) {
        // int n = height.length;
        // int[] maxLeft = new int[n];
        // int[] maxRight = new int[n]; 
        int max = Integer.MIN_VALUE;
        int l = 0;
        int r = height.length-1;
        int leftMax = height[l];
        int rightMax = height[r];
        int count=0;
        while(r > l){
           if(leftMax < rightMax){
            l++;
            leftMax = Math.max(leftMax, height[l]);
            count+= leftMax - height[l];
           } else{
             r--;
             rightMax = Math.max(rightMax, height[r]);
             count+= rightMax - height[r];
           }
        }
        // for(int i=0;i< n ;i++){
        //     max = Math.max(max, height[i]);
        //     maxLeft[i]= max;
        // }
        // max = 0;
        // for(int i = n-1;i >= 0 ;i--){
        //     max = Math.max(max, height[i]);
        //     maxRight[i]= max;
        // }
        // for(int i=0;i<n ;i++){
        //     int min = Math.min(maxLeft[i], maxRight[i]);
        //     min -= height[i];
        //     count+=min;
        // }
        return count;
    }
}
