class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int l = 0;
        for(int r = 0 ; r < s.length(); r++){
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            int max = Collections.max(map.values());
            while(((r-l+1) - max) > k){
                map.put(s.charAt(l), map.getOrDefault(s.charAt(l), 0) - 1);
                l++;
            }
            maxLen = Math.max((r-l+1), maxLen);
        }
        return maxLen;
    }
}
