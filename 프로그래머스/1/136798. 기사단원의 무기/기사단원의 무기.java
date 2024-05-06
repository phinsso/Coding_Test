class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i = 1; i <= number; i++) {
            int divisors = count(i);
            
            if(divisors > limit)
                answer += power;
            else answer += divisors;
        }
        
        return answer;
    }
    
    static int count(int num) {
        int cnt = 0;
        
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (num / i == i)
                    cnt++;
                else 
                    cnt += 2;
            }
        }
        
        return cnt;
    }
}