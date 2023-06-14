class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n % 7 == 0) // 피자 한 판이 남는 것 없이 나눠질 때
            answer = (int)Math.ceil(n / 7);
        else
            answer = (int)Math.ceil(n / 7) + 1;
        
        return answer;
    }
}