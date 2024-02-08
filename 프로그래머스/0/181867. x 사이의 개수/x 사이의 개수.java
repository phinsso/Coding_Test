class Solution {
    public int[] solution(String myString) {
        
        String[] myStringArr = myString.split("x", myString.length());
        int[] answer = new int[myStringArr.length];
        
        for(int i = 0; i < myStringArr.length; i++) {
            answer[i] = myStringArr[i].length();
        }
        
        return answer;
    }
}