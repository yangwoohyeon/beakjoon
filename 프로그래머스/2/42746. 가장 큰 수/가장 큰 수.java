import java.util.Arrays;

public class Solution {
    public String solution(int[] numbers) {
       String[] str = new String[numbers.length];
        for(int i=0; i<numbers.length; i++){
            str[i] = Integer.toString(numbers[i]);
        }
        Arrays.sort(str,(a,b)->(b+a).compareTo(a+b));
        if(str[0].equals("0")){
            return "0";
        }
        StringBuilder answer = new StringBuilder();
        for(String s : str){
            answer.append(s);
        }
        return answer.toString();
    }
}