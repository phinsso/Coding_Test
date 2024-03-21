class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String tmp = "";
        String[] eng = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < eng.length; i++) {
            numbers = numbers.replace(eng[i], Integer.toString(i));
        }
        
        answer = Long.parseLong(numbers);
        
        return answer;
    }
}