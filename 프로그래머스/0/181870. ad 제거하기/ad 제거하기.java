import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> answerArr = new ArrayList<>();
        
        for(String str : strArr) {
            if(!str.contains("ad"))
                answerArr.add(str);
        }
        
        String[] answer = answerArr.toArray(new String[0]);
        return answer;
    }
}