import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String s : participant){
            if(map.containsKey(s)==false){
                map.put(s,1);
            }
            else {
                int a = map.get(s);
                map.replace(s,a+1);
            }
        }
        
        for(String s : completion){
            if(map.get(s)==1){
                map.remove(s);
            }
            else{
                int a = map.get(s);
                map.replace(s,a-1);
            }
        }
        
        for(String s : participant){
            if(map.containsKey(s)){
                return s;
            }
        }
        return answer;
    }
}