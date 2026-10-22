class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int num =0;
        int[] arr = new int[26];
        for(int i=0;i< s.length(); i++){
            // num = (int) (s.charAt(i) - 97);
            num = s.charAt(i) - 'a';
            arr[num]++;
        }
        for(int i=0;i< t.length(); i++){
            // num = (int) (t.charAt(i)- 97);
            num = t.charAt(i) - 'a';
            arr[num]--;
        }
        for(int i=0;i < 26; i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
}
