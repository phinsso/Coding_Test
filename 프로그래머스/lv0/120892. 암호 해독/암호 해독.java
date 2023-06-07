class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        char[] arr = cipher.toCharArray(); // char형의 배열로 만들기
        
        for(int i = 0; i < arr.length; i++) {
            if((i + 1) % code == 0) {
                answer += arr[i];
            }
        }
        return answer;
    }
}