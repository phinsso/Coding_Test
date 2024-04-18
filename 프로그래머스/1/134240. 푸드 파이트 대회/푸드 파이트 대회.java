import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int left = 1;
        int right = food.length - 1;

        for(int i = 1; i < food.length; i++) {
            if (food[i] % 2 != 0)
                food[i]--;
        }

        for(int i = 1; i < food.length; i++) {
            for(int j = 0; j < food[i] / 2; j++) {
                sb.append(Integer.toString(i));
            }
        }

        String s = String.valueOf(sb);
        StringBuilder ss = new StringBuilder(s);
        sb.append(ss.reverse());
        sb.insert(sb.length() / 2,"0");

        answer = String.valueOf(sb);
        return answer;
    }
}