class Solution {
    public String solution(String n_str) {
        String answer = "";
        StringBuilder sb = new StringBuilder(n_str);
        
        // 앞에서부터 제거 후 다시 while문을 실행하기 때문에 인덱스를 0으로
        while(sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}