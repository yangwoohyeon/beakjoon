import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String[] str = new String[numbers.length];
        for(int i=0; i<numbers.length; i++){
            str[i]=Integer.toString(numbers[i]);
        }
        Arrays.sort(str,(a,b)->(b+a).compareTo(a+b));
        if(str[0].equals("0")){
            return "0";
        }
        StringBuilder s = new StringBuilder();
        for(int i=0; i<numbers.length; i++){
            s.append(str[i]);
        }
        return s.toString();
    }
}