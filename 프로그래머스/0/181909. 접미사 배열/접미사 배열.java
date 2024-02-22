import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        List<String> tmpArr = new ArrayList<>();
        String tmp = ""; 
        
        for(int i = 0; i < my_string.length(); i++) {
            tmp = my_string.substring(i);
            tmpArr.add(tmp);
        }
        
        answer = tmpArr.toArray(new String[0]);
        Arrays.sort(answer);
        
        return answer;
    }
}