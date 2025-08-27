class Solution {
    static int[] answer= new int[2];
    public int[] solution(int[][] arr) {
        dp(arr,0,0,arr.length);
        
        return answer;
    }
    public boolean check(int[][] arr, int x, int y,int n){
        for(int i=x; i<x+n; i++){
            for(int j=y; j<y+n; j++){
                if(arr[x][y]!=arr[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    public void dp(int[][] arr, int x, int y,int n){
        if(check(arr,x,y,n)){
            answer[arr[x][y]]++;
            return;
        }
        n=n/2;
        dp(arr,x,y,n);
        dp(arr,x+n,y,n);
        dp(arr,x,y+n,n);
        dp(arr,x+n,y+n,n);
    }
    
}