class Solution {
    public int solution(int num, int k) {
        String tmp = Integer.toString(num);
        
        for(int i = 0; i < tmp.length(); i++) {
            if(tmp.charAt(i) == Character.forDigit(k, 10))
                return i + 1;
        }
        
        return -1;
    }
}