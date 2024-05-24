import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        List<Integer> scoreList = new ArrayList<>();
        
        for(int s : score) {
            scoreList.add(s);
        }
        
        Collections.sort(scoreList, Collections.reverseOrder());
        
        for(int i = 0; i <= scoreList.size() - m; i += m) {
            List<Integer> subList = scoreList.subList(i, i+m);
            answer += Collections.min(subList) * m;
        }
        
        return answer;
    }
}