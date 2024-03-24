import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        String str = Arrays.toString(arr);
        int num1 = -1, num2 = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (num1 == -1) {
                    num1 = i;
                }
                num2 = i;
            }
        }
        
        if(num1 == -1) {
            return new int[]{-1};
        } else {
            return Arrays.copyOfRange(arr, num1, num2+1);
        }
        
    }
}