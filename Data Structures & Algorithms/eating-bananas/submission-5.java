class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int len = piles.length;
        int max = piles[len-1];
        int left = 0;
        int right = max;
        int min = Integer.MIN_VALUE;
        while(right >= left){
            int mid = left + (right - left)/2;
            long sum =0;
            for(int i =0; i< len ;i++){
                sum += Math.ceil((double)piles[i]/mid);
            }
            if(sum > h){
                left = mid+1;
            } else {
                min = mid;
                right = mid-1;
            }
        }
        return min;
    }
}
