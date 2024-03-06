class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string);
        String[] str = new String[my_string.length() / m];
        
        for(int i = 0; i < str.length; i++) {
            str[i] = sb.substring(0, m);
            sb.delete(0, m);
        }
        
        for(int i = 0; i < str.length; i++) {
            answer += str[i].charAt(c-1);
        }
        
        return answer;
    }
}