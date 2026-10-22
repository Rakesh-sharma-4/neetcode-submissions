class Solution {
    public int[] twoSum(int[] nums, int target) {
        int maxSum = Integer.MIN_VALUE;
        int len = nums.length;
        int ans[]= new int[2];
        for(int i=0; i<len-1 ;i++){
            for(int j=i+1; j<len;j++){
                int sum = nums[i]+nums[j];
                if(sum == target){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;
    }
}
