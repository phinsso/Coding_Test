import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] tmpArr = {};
        List<String> tmpList = new ArrayList<>();
        
        tmpArr = myStr.split("a|b|c");
        
        for(int i = 0; i < tmpArr.length; i++) {
            if(!tmpArr[i].equals("")) {
                tmpList.add(tmpArr[i]);
            }
        }
        
        if(tmpList.isEmpty())
            tmpList.add("EMPTY");
        
        String[] answer = tmpList.toArray(new String[tmpList.size()]);
        
        return answer;
    }
}