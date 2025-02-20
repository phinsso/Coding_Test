class Solution {
    public int solution(String s) {
        int sign = 1;
        
        if(s.charAt(0) == '-') {
            sign = -1;
            s = s.substring(1);
        } else if(s.charAt(0) == '+')
            s = s.substring(1);
            
        
        return Integer.parseInt(s) * sign;
    }
}