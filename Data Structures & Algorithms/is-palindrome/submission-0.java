class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder forwardSb = new StringBuilder();
        StringBuilder reversedSb = new StringBuilder();
        s = s.replaceAll("[^a-zA-Z0-9]", "")
             .toLowerCase();
        for(int i=0; i< s.length(); i++){
            if(s.charAt(i)!= ' '){
                forwardSb.append(s.charAt(i));
            }
        }
        for(int i=s.length()-1; i >= 0; i--){
            if(s.charAt(i)!= ' '){
                reversedSb.append(s.charAt(i));
            }
        }
        System.out.println("Fsb : " + forwardSb);
        System.out.println("Fsb : " + reversedSb);
        return forwardSb.toString().equals(reversedSb.toString());
    }
}
