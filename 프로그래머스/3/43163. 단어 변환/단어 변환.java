import java.util.*;
class Solution {
    public int solution(String begin, String target, String[] words) {
        Queue<String> queue = new LinkedList<>();
        queue.add(begin);
        int count = 0;
        boolean[] visit = new boolean[words.length];
        while(!queue.isEmpty()){
            String str = queue.poll();
            if(str.equals(target)){
                break;
            }
            boolean checkCount = false;
            for(int i=0; i<words.length; i++){
                if(!visit[i] && check(str,words[i])){
                    queue.add(words[i]);
                    visit[i]=true;
                    checkCount=true;
                }
            }
            if(checkCount){
                count++;
            }
            if(queue.isEmpty()){
                return 0;
            }
        }
        return count;
        
    }
    public boolean check(String s1, String s2){
        int count=0;
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
            }
        }
        if(count==1){
            return true;
        }
        return false;
    }
}