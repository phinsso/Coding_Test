class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        StringBuilder str = new StringBuilder(my_string);
        StringBuilder tmp = new StringBuilder();
        
        int j = 0;
        
        for(int i = s; i <= e; i++) {
            tmp.append(str.charAt(i));
            str.setCharAt(i, '.');
        }
        
        tmp.reverse();
        
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '.') {
                str.setCharAt(i, tmp.charAt(j++));
                System.out.println(j);
            }
        }
        
        answer = str.toString();
        
        return answer;
    }
}