class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n >= a) {
            int tmp = n / a; // 빈병 / 마트에 줘야하는 병의 수
            answer += tmp * b; // 성빈이가 받는 콜라의 수 (위에서 구한 몫 * b개)
            n = tmp * b + n % a; // 남은 빈병과 받은 콜라(빈병)의 수를 더하여 n을 갱신
        }
    
        return answer;
    }
}