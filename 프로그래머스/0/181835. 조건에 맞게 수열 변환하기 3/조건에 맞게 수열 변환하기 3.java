class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        
        if(k % 2 != 0) {
            for(int j = 0; j < arr.length; j++) {
                arr[j] *= k;
            }
        } else {
            for(int j = 0; j < arr.length; j++) {
                arr[j] += k;
            }
        }
        
        answer = arr;
        
        return answer;
    }
}