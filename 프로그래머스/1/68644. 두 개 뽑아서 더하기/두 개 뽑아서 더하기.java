import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length; j++) {
                if(i != j) {
                    arr.add(numbers[i] + numbers[j]);
                }
            }
        }
        
        int[] answer = arr.stream().distinct().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        
        return answer;
    }
}