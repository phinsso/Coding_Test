import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> kList = new ArrayList<>();
        int[] kArr = new int[score.length];
        
        for(int i = 0; i < score.length; i++) {
            kList.add(score[i]);
            Collections.sort(kList, Collections.reverseOrder());
            
            if(kList.size() <= k)
                answer[i] = kList.get(kList.size() - 1);
            else
                answer[i] = kList.get(k-1);
        }
        
        return answer;
    }
}