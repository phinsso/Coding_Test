import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < rank.length; i++) {
            if(attendance[i] == true)
                map.put(rank[i], i);
        }
        
        List<Integer> keyList = new ArrayList<>(map.keySet());
        List<Integer> valueList = new ArrayList<>();
        
        Collections.sort(keyList);
        
        int n = 0;
        for(int i = 0; i < 3; i++) {
            n = keyList.get(i);
            valueList.add(map.get(n));
        }
        
        answer = 10000 * valueList.get(0) + 100 * valueList.get(1) + valueList.get(2);
        
        return answer;
    }
}