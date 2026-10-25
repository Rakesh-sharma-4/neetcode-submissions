class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int prod = 1;
        int zeroCount = 0;
        for(int a : nums){
            if(a == 0){
                zeroCount++;
            }else{
                prod= prod * a;
            }
        }
        if(zeroCount > 1){
            for(int i=0;i<len; i++){
                res[i]=0;
            }
        }else if(zeroCount == 1){
            for(int i=0;i<len ; i++){
                if(nums[i] == 0){
                    res[i]= prod;
                }else{
                    res[i]=0;
                }
            }
        } else{
            for(int i=0; i<len; i++){
                res[i] = prod/nums[i];
            }
        }
        return res;
    }
}  
