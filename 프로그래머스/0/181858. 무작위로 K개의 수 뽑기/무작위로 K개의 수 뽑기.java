import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        List<Integer> ansArr = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(!ansArr.contains(arr[i])) {
                ansArr.add(arr[i]);
            }
            
            if(ansArr.size() == k) break;
        }
        
        while(ansArr.size() < k) {
            ansArr.add(-1);
        }
        
        for(int i = 0; i < ansArr.size(); i++) {
            answer[i] = ansArr.get(i);
        }
                
        return answer;
    }
}