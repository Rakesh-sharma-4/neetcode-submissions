class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i< len;i++){
            int left = i+1;
            int right = len-1;
            int target = -1 * nums[i];
            while(left < right){
                int sum = nums[left] + nums[right];
                if(sum == target){
                    List<Integer> inList = new ArrayList<>();
                    inList.add(nums[i]);
                    inList.add(nums[left]);
                    inList.add(nums[right]);
                    if(!list.contains(inList)){
                        list.add(inList);
                    }
                    left++;
                    right--;
                } else if(sum > target){
                    right--;
                } else{
                    left++;
                }
            }
        }
        return list;
    }
}
