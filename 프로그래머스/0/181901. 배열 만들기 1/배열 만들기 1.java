import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        for(int i = 1; i <= n; i++) {
            if(i % k == 0) arr.add(i);
        }
        
        int[] answer = new int[arr.size()];
        int cnt = 0;
        for(int temp : arr) {
            answer[cnt++] = temp;
        }
        
        return answer;
    }
}