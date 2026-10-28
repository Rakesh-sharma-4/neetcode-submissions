class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int forward = 0;
        int backward = numbers.length-1;
        while(forward < backward){
            int sum = numbers[forward] + numbers[backward];
            if(sum == target){
                return new int[]{forward+1 , backward+1};
            } else if(sum < target){
                forward++;
            } else{
                backward--;
            }
            // System.out.println("Sum: " + sum + " forward: " + forward + " backward: " + backward);
        }
        return new int[]{};
    }
}
