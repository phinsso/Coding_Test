import java.util.*;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int all;
        
        for(int i = 0; i < absolutes.length; i++) {
            if(signs[i] == true)
                answer += absolutes[i];
            else
                answer += absolutes[i] * -1;
        }
        
        return answer;
    }
}