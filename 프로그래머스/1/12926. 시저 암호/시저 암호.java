class Solution {
    public String solution(String s, int n) {
        String answer = "";
        Character alphabet;
        
        for(int i = 0; i < s.length(); i++) {
            alphabet = s.charAt(i);
            
            if(Character.isUpperCase(alphabet)) {
                answer += Character.toString((alphabet - 'A' + n) % 26 + 'A');
            } else if(Character.isLowerCase(alphabet)) {
                answer += Character.toString((alphabet - 'a' + n) % 26 + 'a');   
            } else answer += Character.toString(alphabet);
        }
        
        return answer;
    }
}