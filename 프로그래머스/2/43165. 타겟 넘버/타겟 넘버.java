class Solution {
    int count;
    public int solution(int[] numbers, int target) {
        count=0;
        dfs(numbers,target,0,0);
        return count;
    }
    public void dfs(int[] numbers, int target, int start, int now){
        if(start==numbers.length){
            if(target==now){
                count++;
            }
            return;
        }
        dfs(numbers, target, start+1, now + numbers[start]);
        dfs(numbers, target, start+1, now - numbers[start]);
    }
}