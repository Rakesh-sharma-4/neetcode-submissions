class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // int forward = 0;
        // int backward = numbers.length-1;
        // while(forward < backward){
        //     int sum = numbers[forward] + numbers[backward];
        //     if(sum == target){
        //         return new int[]{forward+1 , backward+1};
        //     } else if(sum < target){
        //         forward++;
        //     } else{
        //         backward--;
        //     }
        // }
        // return new int[]{};

        Map<Integer, Integer> map= new HashMap<>();
        for(int i=0;i < numbers.length; i++){
            int req = target - numbers[i];
            if(map.containsKey(numbers[i])){
                return new int[]{map.get(numbers[i]), i+1};
            }
            map.put( req, i+1 );
        }
        return new int[0];
    }
}
