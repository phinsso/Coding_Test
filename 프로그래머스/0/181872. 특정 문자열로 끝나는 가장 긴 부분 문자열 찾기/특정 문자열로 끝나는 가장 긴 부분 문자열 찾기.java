class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int idx = 0;
        
        for(int i = 0; i <= myString.length(); i++) {
            String tmp = myString.substring(0, i); // substring은 endindex - 1이란 것을 명심!!!
            if(tmp.endsWith(pat))
                answer = tmp;
        }
        
        return answer;
    }
}