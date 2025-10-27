import java.util.*;
class Solution {
    public int solution(String s) {
        int answer=0;
        for(int i=0; i<s.length(); i++){
            String str = rolling(s,i);
            if(check(str)){
                answer++;
            }
        }
        return answer;
    }
    public boolean check(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='[' || c=='(' || c=='{'){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                if(c=='}'){
                    if(stack.pop()!='{'){
                        return false;
                    }
                }
                else if(c==']'){
                    if(stack.pop()!='['){
                        return false;
                    }
                }
                else if(c==')'){
                    if(stack.pop()!='('){
                        return false;
                    }
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
    
    public String rolling(String s, int n){
        StringBuilder str = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            str.append(s.charAt(n));
            n++;
            if(n==s.length()){
                n=0;
            }
        }
        return str.toString();
    }
}