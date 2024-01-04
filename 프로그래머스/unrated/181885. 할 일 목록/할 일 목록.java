class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        StringBuilder tmp = new StringBuilder();
        int cnt = 0;
        
        for(int i = 0; i < todo_list.length; i++) {
            if(!finished[i])
                tmp.append(todo_list[i]).append(",");
        }
        
        // 마지막에 들어간 쉼표 제거
        String result = tmp.deleteCharAt(tmp.length() - 1).toString();
        
        // 쉼표를 기준으로 문자열 분리하여 배열로 반환
        String[] answer = result.split(",");
        
        return answer;
    }
}