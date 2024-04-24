import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        StringBuilder[] sb = new StringBuilder[strings.length];
        
        for(int i = 0; i < strings.length; i++) {
            sb[i] = new StringBuilder(strings[i]);
            sb[i].insert(0, Character.toString(strings[i].charAt(n)));
        }
        
        Arrays.sort(sb);
        
        for(int i = 0; i < answer.length; i++) {
            sb[i].deleteCharAt(0);
            answer[i] = sb[i].toString();
        }
        
        return answer;
    }
}