class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        StringBuilder modifyStr = new StringBuilder(myString);
        
        for(int i = 0; i < modifyStr.length(); i++) {
            if(modifyStr.charAt(i) == 'A')
                modifyStr.setCharAt(i, 'B');
            else
                modifyStr.setCharAt(i, 'A');
        }
        
        if(modifyStr.toString().contains(pat))
            answer = 1;
        else answer = 0;
        
        return answer;
    }
}