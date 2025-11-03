class Solution {
    static int count=0; 
    public int solution(int[] numbers, int target) {
        dfs(numbers,0,0,target);
        return count;
    }
    public void dfs(int[] numbers, int pos, int num, int target){
        if(pos==numbers.length && num==target){
            count++;
            return;
        }
        if(pos+1<=numbers.length){
            dfs(numbers,pos+1,num+numbers[pos],target);
            dfs(numbers,pos+1,num-numbers[pos],target);
        }
    }
}