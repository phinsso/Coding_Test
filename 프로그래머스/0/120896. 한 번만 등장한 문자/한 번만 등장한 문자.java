import java.util.TreeMap;
import java.util.Map;

class Solution {
    public String solution(String s) {
        String answer = "";
        Map<Character, Integer> map = new TreeMap<>();

        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char key : map.keySet()) {
            if(map.get(key) == 1)
                answer += Character.toString(key);
        }
        
        return answer;
    }
}