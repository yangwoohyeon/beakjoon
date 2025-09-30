import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;

        for(int i=0; i<s.length(); i++){
            StringBuilder str = new StringBuilder();
            for(int j=i; j<s.length(); j++){
                str.append(s.charAt(j));
            }
            if(i!=0){
                for(int j=0; j<i; j++){
                    str.append(s.charAt(j));
                }
            }
            if(check(str.toString())){
                answer++;
            }
        }
        
        return answer;
    }
    private boolean check(String s){
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c==']'){
               
                if(stack.isEmpty() || stack.pop()!='['){
                    return false;
                }
            }
            else if(c==')'){
                if(stack.isEmpty() || stack.pop()!='('){
                    return false;
                }
            }
            else if(c=='}'){
                if(stack.isEmpty() || stack.pop()!='{'){
                    return false;
                }
            }
            else{
                stack.add(c);
            }
            
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}