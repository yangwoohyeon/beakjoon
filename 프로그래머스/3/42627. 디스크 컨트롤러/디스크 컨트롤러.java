import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        Arrays.sort(jobs,(o1,o2)->{
           return o1[0]-o2[0]; 
        });
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        int[] returnTime = new int[jobs.length];

        int n = jobs.length;
        int idx = 0;        // 아직 PQ에 넣지 않은 다음 작업의 인덱스
        int time = 0;       // 현재 시각
        int sum = 0;        // 총 턴어라운드 시간 합
        int done = 0;       // 완료한 작업 수
        while(done<n){
            //현재 시간까지 도착한 작업 우선순위 큐에 삽입
            while(idx<n && jobs[idx][0]<=time){
                pq.add(jobs[idx]);
                idx++;
            }
            if(pq.isEmpty()){
                time=jobs[idx][0];
                continue;
            }
            
            //가장 짧은 작업을 처리
            int[] job = pq.poll();
            time+=job[1]; //완료시간까지 증가
            sum+=(time-job[0]);
            done++;
        }
        
        return sum/n;
    }
}