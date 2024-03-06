class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] strArr = my_string.replaceAll("[a-zA-Z]", " ").split(" ");
        
        for(String s : strArr) {
            if(!s.equals("")) // 원소에 공백만 들어있으면 해당 원소는 빈 문자열로 취급
                answer += Integer.parseInt(s);
        }
        
        return answer;
    }
}