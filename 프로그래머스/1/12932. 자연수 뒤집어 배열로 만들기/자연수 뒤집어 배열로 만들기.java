class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        StringBuilder sb = new StringBuilder(str).reverse();
        int[] answer = new int[sb.length()];
        
        for(int i = answer.length - 1; i >= 0; i--) {
            answer[i] = Character.getNumericValue(sb.charAt(i));
        }
        
        return answer;
    }
}