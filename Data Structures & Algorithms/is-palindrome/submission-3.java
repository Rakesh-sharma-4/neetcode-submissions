class Solution {
    public boolean isPalindrome(String s) {
        // StringBuilder forwardSb = new StringBuilder();
        // StringBuilder reversedSb = new StringBuilder();
        s = s.replaceAll("[^a-zA-Z0-9]", "")
             .toLowerCase();
        int len = s.length();
        for(int i=0; i< len/2; i++){
            // forwardSb.append(s.charAt(i));
            // reversedSb.append(s.charAt(len-1-i));
            if(s.charAt(i) != s.charAt(len-i-1)){
                return false;
            }
        }
        // return forwardSb.toString().equals(reversedSb.toString());
        return true;
    }
}
