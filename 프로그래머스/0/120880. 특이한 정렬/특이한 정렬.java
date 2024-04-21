import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int tmp;
        
        Arrays.sort(numlist);
        
        for(int i = 0; i < numlist.length; i++) {
            for(int j = 0; j < numlist.length; j++) {
                if(Math.abs(n - numlist[i]) <= Math.abs(n - numlist[j])) {
                    tmp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = tmp;
                }
            }
        }
        
        return numlist;
    }
}