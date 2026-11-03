class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] res = new int[len];
        Stack<int[]> stack = new Stack<>();
        for(int i=0;i< len; i++){
            int val = temperatures[i];
            while(!stack.isEmpty() && val > stack.peek()[0]){
                int[] pair = stack.pop();
                res[pair[1]] = i - pair[1];
            }
            stack.push(new int[]{val,i});
        }
        return res;
    }
}
