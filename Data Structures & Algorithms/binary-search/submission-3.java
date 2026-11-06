class Solution {
    public int search(int[] nums, int target) {
        int left =0;
        int right = nums.length;
        while(right > left){
            int mid = (right + left)/2;
            if(target == nums[mid]){
                return mid;
            } else if(target > nums[mid]){
                left = mid+1;
            } else{
                right = mid;
            }
        }
        return -1;
    }
}
