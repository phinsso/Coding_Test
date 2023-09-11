import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String AplusB = String.valueOf(a) + String.valueOf(b);
        int multiple2 = 2 * a * b;
        
        if(Integer.parseInt(AplusB) >= multiple2)
            answer = Integer.parseInt(AplusB);
        else
            answer = multiple2;
        
        return answer;
    }
}