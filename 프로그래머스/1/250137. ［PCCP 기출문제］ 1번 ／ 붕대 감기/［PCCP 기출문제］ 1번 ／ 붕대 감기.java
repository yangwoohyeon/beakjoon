class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        
        int remainHealth = health;
        int attackTime   = 0;
        int healSec      = 0;
        
        for(int sec=1; sec <= attacks[attacks.length - 1][0]; sec++) {
            if(sec == attacks[attackTime][0]) {
                remainHealth -= attacks[attackTime][1];
                healSec      = 0;
                
                // 죽었으면 return
                if(remainHealth <= 0) return -1;
                
                // 마지막 공격 시간이 아니면, 다음 공격회차로 세팅
                if(attackTime < attacks.length) attackTime++;
                
                continue;
            } 
            
            remainHealth += bandage[1];
            healSec++;

            // 연속 피채우기 성공이면 추가 회복
            if(healSec == bandage[0]) {
                remainHealth += bandage[2];
                healSec      = 0;
            } 

            // 최대 체력 넘으면 최대 체력으로 세팅
            if(remainHealth > health) remainHealth = health;
        }
        
        answer = remainHealth;
        return answer;
    }
}