import java.util.*;
class Solution {
    int count=0;
    public int solution(String s) {
        dfs(s,0);
        return count;
    }
    
    public void dfs(String s,int n){
       if(n>=s.length()){
           return;
       }
        if(check(s)){
            count++;
        }
        int size = s.length();
        dfs(s.substring(1,size)+s.charAt(0),n+1);
        
    }
    
    
    public boolean check(String s){
        Stack<Character> stack = new Stack<>();
        int idx=0;
        stack.push(s.charAt(idx));
        idx++;
        while(true){
            if(idx>=s.length()){
                break;
            }
            char c = s.charAt(idx);
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
                idx++;
            }
            else if(stack.isEmpty()){
                return false;
            }
            else if(c==')'){
                char a = stack.pop();
                if(a!='('){
                    return false;
                }
                idx++;
            }
            else if(c=='}'){
                char a = stack.pop();
                if(a!='{'){
                    return false;
                }
                idx++;
            }
            else if(c==']'){
                char a = stack.pop();
                if(a!='['){
                    return false;
                }
                idx++;
            }
            
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
               
}