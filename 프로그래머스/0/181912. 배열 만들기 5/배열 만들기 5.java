import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < intStrs.length; i++) {
            int n = Integer.parseInt(intStrs[i].substring(s, s+l));
            if(n > k)
                arr.add(n);
        }
        
        int[] answer = arr.stream().mapToInt(i -> i.intValue()).toArray();
        
        return answer;
    }
}