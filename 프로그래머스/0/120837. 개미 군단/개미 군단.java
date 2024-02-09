class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        // answer에 각 개미의 공격력으로 나눈 몫을 더한 뒤
        answer += (hp / 5);
        // hp에 나눈 나머지를 할당함.
        hp %= 5;
        answer += (hp / 3);
        hp %= 3;
        answer += (hp / 1);
        
        return answer;
    }
}