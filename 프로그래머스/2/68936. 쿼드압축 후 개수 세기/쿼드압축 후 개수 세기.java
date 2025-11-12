class Solution {
    int[] ans = new int[2];
    public int[] solution(int[][] arr) {
        dp(arr,0,0,arr.length);
        return ans;
    }
    public boolean check(int[][] arr, int x, int y, int n){
        if(x+n<=arr.length && y+n<=arr.length){
        int a = arr[x][y];
            for(int i=x; i<x+n; i++){
                for(int j=y; j<y+n; j++){
                    if(a!=arr[i][j]){
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
    public void dp(int[][] arr,int x,int y, int size){
        if(x>=arr.length || y>=arr.length){
            return;
        }
        if(check(arr,x,y,size)){
            ans[arr[x][y]]++;
            return;
        }

        size=size/2;
        dp(arr,x,y,size);
        dp(arr,x+size,y,size);
        dp(arr,x,y+size,size);
        dp(arr,x+size,y+size,size);
    }
}