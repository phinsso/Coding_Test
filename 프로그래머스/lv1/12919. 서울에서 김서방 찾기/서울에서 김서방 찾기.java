class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int ansNum = 0;
        
        for(int x = 0; x < seoul.length; x++) {
            if(seoul[x].equals("Kim")) {
                ansNum = x;
                break;
            }
        }
        
        answer = "김서방은 " + ansNum + "에 있다";
        
        return answer;
    }
}