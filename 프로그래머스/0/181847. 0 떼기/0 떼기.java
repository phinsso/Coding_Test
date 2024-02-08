import java.math.*;

class Solution {
    public String solution(String n_str) {
        String answer = "";
        
        // BigInteger: 문자열 형태로 이루어져 있음.
        // 정수로 변환 시에 숫자 앞에 있는 0은 자동으로 제거됨.
        BigInteger str = new BigInteger(n_str);
        answer = str.toString();
        
        return answer;
    }
}