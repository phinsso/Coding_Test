class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int left = 0;
        int right = p.length();
        
        while(right <= t.length()) {
            if(Long.parseLong(t.substring(left, right)) <= Long.parseLong(p))
                answer++;
            left++;
            right++;
        }   
        
        return answer;
    }
}