class Solution {
    public int solution(int[] sides) {
        int answer = 1;
        int max = 0;
        int total = 0;
        
        for(int i = 0; i < sides.length; i++) {
            total += sides[i];
        }
        
        if(sides[0] > sides[1]) max = sides[0];
        else max = sides[1];
        
        if(sides[2] > max) max = sides[2];
        
        if((total - max) <= max) answer = 2;
        
        return answer;
    }
}