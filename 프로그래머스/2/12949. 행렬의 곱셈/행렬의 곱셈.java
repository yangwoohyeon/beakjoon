import java.util.*;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        int n = arr1.length;
        int m = arr2[0].length;
        answer = new int[n][m];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int x=0;
                for(int k=0; k<arr1[0].length; k++){
                    x+=arr1[i][k] * arr2[k][j];
                }
                answer[i][j]=x;
            }
        }
        return answer;
    }
}