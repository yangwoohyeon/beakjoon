import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        int left = 10;
        int right = 12;
        StringBuilder str = new StringBuilder();
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==1 || numbers[i]==4 || numbers[i]==7){
                str.append('L');
                left = numbers[i];
            }
            else if(numbers[i]==3 || numbers[i]==6 || numbers[i]==9){
                str.append('R');
                right = numbers[i];
            }
            else{
                int n = numbers[i];
                if(numbers[i]==0){
                    n=11;
                }
                int rightDistance = Math.abs(n-right)/3 + Math.abs(n-right)%3;
                int leftDistance = Math.abs(n-left)/3 + Math.abs(n-left)%3;
                if(rightDistance>leftDistance){
                    str.append('L');
                    left=n;
                }
                else if(rightDistance<leftDistance){
                    str.append('R');
                    right=n;
                }
                else{
                    if(hand.equals("right")){
                        str.append('R');
                        right=n;
                    }
                    else{
                        str.append('L');
                        left=n;
                    }
                }
            }
            
        }
        
        return str.toString();
    }
}