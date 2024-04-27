import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        
        for (int i : array) {
            max = Math.max(max, i);
        }
        int[] cntArr = new int[max+1];
        
        for(int i = 0; i < array.length; i++) {
            cntArr[array[i]]++;
        }
        
        int maxCnt = cntArr[0];
        for(int i = 1; i < cntArr.length; i++){
            if(maxCnt < cntArr[i]){
                maxCnt = cntArr[i];
                answer = i;
            } else if(maxCnt == cntArr[i]){
                answer = -1;
            }
        }
         
        return answer;
    }
}