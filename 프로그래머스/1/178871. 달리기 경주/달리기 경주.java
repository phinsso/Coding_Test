import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        Map<String, Integer> map = new HashMap<>(); // <이름, 등수>
        
        for(int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        
        for(int i = 0; i < callings.length; i++) {
            int idx = map.get(callings[i]);
            
            String temp = players[idx - 1]; // 추월당한 선수
            players[idx - 1] = players[idx]; // 추월당한 선수의 인덱스를 바꿈
            players[idx] = temp; // 추월한 선수의 인덱스를 바꿈
            
            map.put(callings[i], idx - 1);
            map.put(temp, idx);
            
        }
        
        for(int i = 0; i < players.length; i++) {
            answer[i] = players[i];
        }
        
        
        return answer;
        
    }

}
