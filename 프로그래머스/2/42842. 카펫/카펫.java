import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        for(int w=3; w<2500; w++){
            for(int h=1; h<=w; h++){
                if(w+h==(brown/2)+2){
                    if(w*h==brown+yellow){
                        answer[0]=w;
                        answer[1]=h;
                    }
                }          
            }
        }
        return answer;
    }
    
}