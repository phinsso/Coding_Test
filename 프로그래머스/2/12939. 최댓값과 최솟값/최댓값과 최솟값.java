class Solution {
    public String solution(String s) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        String[] tmp = s.split(" ");
        
        for(int i = 0; i < tmp.length; i++) {
            max = Math.max(max, Integer.parseInt(tmp[i]));
            min = Math.min(min, Integer.parseInt(tmp[i]));
        }
        
        return Integer.toString(min) + " " + Integer.toString(max);
    }
}