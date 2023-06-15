import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int[] arr = new int[2];
        
        s = s.toLowerCase();
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'p') arr[0]++;
            else if(s.charAt(i) == 'y') arr[1]++;
        }
        
        answer = (arr[0] == arr[1]) ? true : false;

        return answer;
    }
}