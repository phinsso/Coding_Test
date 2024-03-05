class Solution {
    public int solution(int order) {
        int answer = 0;
        String strOrder = Integer.toString(order);
        
        for(int i = 0; i < strOrder.length(); i++) {
            char charOrder = strOrder.charAt(i);
            if(charOrder == '3' || charOrder == '6' || charOrder == '9')
                answer++;
        }
        
        return answer;
    }
}