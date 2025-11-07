class Solution {
    public int solution(int[][] sizes) {
        int max_x = Integer.MIN_VALUE;
        int max_y = Integer.MIN_VALUE;
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0]<sizes[i][1]){
                int tmp = sizes[i][0];
                sizes[i][0]=sizes[i][1];
                sizes[i][1] = tmp;
            }
            if(sizes[i][0]>max_x){
                max_x = sizes[i][0];
            }
            if(sizes[i][1]>max_y){
                max_y = sizes[i][1];
            }
        }
        
        return max_x * max_y;
        
    }
}