class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder forwardSb = new StringBuilder();
        StringBuilder reversedSb = new StringBuilder();
        s = s.replaceAll("[^a-zA-Z0-9]", "")
             .toLowerCase();
             int len = s.length();
        int index = len-1;
        for(int i=0; i< len; i++){
            forwardSb.append(s.charAt(i));
            reversedSb.append(s.charAt(index--));
        }
        return forwardSb.toString().equals(reversedSb.toString());
    }
}
