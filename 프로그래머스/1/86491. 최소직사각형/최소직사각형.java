class Solution {
    public int solution(int[][] sizes) {
        int[][] arr = sort(sizes);
        int x = 0;
        int y = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i][0]>x){
                x=arr[i][0];
            }
            if(arr[i][1]>y){
                y=arr[i][1];
            }
        }
        return x*y;
    }
    public int[][] sort(int[][] sizes){
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0]<sizes[i][1]){
                int tmp = sizes[i][0];
                sizes[i][0]=sizes[i][1];
                sizes[i][1]=tmp;
            }
        }
        return sizes;
    }
}