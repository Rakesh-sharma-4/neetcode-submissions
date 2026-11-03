class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] res = new int[len];
        for(int i=0; i<len-1; i++){
            int count = 0;
            for(int j = i+1; j<len;j++){
                count++;
                if(temperatures[j] > temperatures[i]){
                    res[i]= count;
                    break;
                }
            }
        }
        return res;
    }
}
