class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length + 1];
        for(int a : nums){
            map.put(a, map.getOrDefault(a,0)+1);
        }
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        int[] res = new int[k];
        int pos = 0;
        for(int i = bucket.length -1 ; i >=0 && pos < k ; i--){
            if(bucket[i]!= null){
                for( Integer integer : bucket[i]){
                    res[pos++] = integer;
                }
            }
        }
        return res;
    }
}
