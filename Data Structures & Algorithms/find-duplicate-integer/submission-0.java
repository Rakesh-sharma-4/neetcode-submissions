class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for(int a : nums){
            if(seen.contains(a)){
                return a;
            }
            seen.add(a);
        }
        return 0;
    }
}
