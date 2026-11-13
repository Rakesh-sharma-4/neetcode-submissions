class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int len = s.length();
        int left =0;
        Set<Character> seen = new HashSet<>();
        for(int i=0; i< len; i++){
            char a = s.charAt(i);

            while(seen.contains(a)){
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(a);
            maxLen = Math.max(maxLen, i-left+1);
        }
        return maxLen;
    }
}
