import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        Map<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char key : map.keySet()) {
            if(map.get(key) == 1)
                answer += Character.toString(key);
        }

        char[] answerArr = answer.toCharArray();
        Arrays.sort(answerArr);
        answer = String.valueOf(answerArr);
        
        return answer;
    }
}