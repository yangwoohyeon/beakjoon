import java.util.*;
class Solution {
    int[][] triangle;
    int size=0;
    public int[] solution(int n) {
        int[] answer;
        if(n==1){
            return new int[]{1};
        }
        triangle = new int[n][n];
        func(n);
        answer = new int[size];
        int idx=0;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(triangle[i][j]==0){
                    j=n;
                }
                else{
                    answer[idx++]=triangle[i][j];
                }
            }
        }
        return answer;
    }
    private void func(int n){
        String state="down";
        int repeat = n;
        int x = -1;
        int y = 0;
        int number = 1;
        while(true){
            if(state.equals("down")){
                if(x+1<n && triangle[x+1][y]!=0){
                    return;
                }
                for(int i=0; i<repeat; i++){
                        x++;
                        triangle[x][y]=number++;
                        size++;
                }
                state="right";
                repeat--;
            }
            
            if(state.equals("right")){
                if(y+1<n && triangle[x][y+1]!=0){
                    return;
                }
                for(int i=0; i<repeat; i++){
                        y++;
                        triangle[x][y]=number++;
                    
                        size++;
                    
                }
                state="up";
                repeat--;
            }
            
            if(state.equals("up")){
                if(x-1>=0 && y-1>=0 && triangle[x-1][y-1]!=0){
                    return;
                }
                for(int i=0; i<repeat; i++){
                        y--;
                        x--;
                        triangle[x][y]=number++;
                        size++;
                
                }
                state="down";
                repeat--;
            }
        }
    }
}