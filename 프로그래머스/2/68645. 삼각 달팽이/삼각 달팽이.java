import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[][] arr = new int[n][n];
        int startX=0;
        int startY=0;
        int value=1;
        int total = n*(n+1)/2;
        int len=n;
        while(len>0){
            for(int i=0; i<len; i++){ //아래
                arr[startX][startY]=value;
                value++;
                startX++;
                if(i==len-1){startX--;}
            }
            for(int i=0; i<len-1; i++){ //오른쪽
                startY++;
                arr[startX][startY]=value;
                value++;
            }
            for(int i=0; i<len-2; i++){ //대각선
                startX--;
                startY--;
                arr[startX][startY]=value;
                value++;
            }
            len=len-3;
            startX++;
        }
        int[] answer = new int[total];
        int index=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]!=0){
                    answer[index]=arr[i][j];
                    index++;
                }
            }
        }
        
        return answer;
    }
    
    
}