class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int max = 1;
        for(int i=0; i<nums.length -1 ;i++){
            int count = 1;
            while(i < nums.length-1 && (nums[i+1]-nums[i] == 1 || nums[i+1] == nums[i])){
                if(nums[i+1] != nums[i]){
                    count++;
                }
                i++;
            }
            max = count > max ? count : max ;
        }
        return max;
    }
}
