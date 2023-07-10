class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int cup = (int)Math.ceil(money / 5500);
        
        answer[0] = cup;
        answer[1] = money - (5500 * cup);
            
        return answer;
    }
}