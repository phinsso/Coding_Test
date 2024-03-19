class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String tmp  = "";
        
        for(int a = i; a <= j; a++) {
            tmp = Integer.toString(a);
            for(int b = 0; b < tmp.length(); b++) {
                if(tmp.charAt(b) == Character.forDigit(k, 10)) {
                    answer++;
                }
            }
        }
        
        
        return answer;
    }
}