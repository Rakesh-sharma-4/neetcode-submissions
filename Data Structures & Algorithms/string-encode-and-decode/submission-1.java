class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            for(int i=0; i< str.length(); i++){
                char a = str.charAt(i);
                a = (char) (a + '1');
                sb.append(a);
            }
            sb.append('#');
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList();
        for(int i=0; i<str.length();i++){
            StringBuilder sb = new StringBuilder();
            while(str.charAt(i) != '#'){
                char a = str.charAt(i);
                a = (char) (a - '1');
                sb.append(a);
                i++;
            }
            list.add(sb.toString());
        }
        return list;
    }
}
