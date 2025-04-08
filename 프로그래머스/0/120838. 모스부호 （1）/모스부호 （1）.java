import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        
        Map<String, String> map = new HashMap<String, String>();
        for(int i = 0; i < morse.length; i++) {
            map.put(morse[i], alphabet[i]);   
        }
        
        String[] letterArr = letter.split(" ");
        
        for(int i = 0; i < letterArr.length; i++) {
            answer += map.get(letterArr[i]);
        }
        
        return answer;
    }
}