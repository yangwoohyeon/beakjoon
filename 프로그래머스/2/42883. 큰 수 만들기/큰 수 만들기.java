import java.util.*;

class Solution {
    public String solution(String number, int k) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<number.length(); i++){
                    while(k>0 && !stack.isEmpty() && number.charAt(i) - '0'>stack.peek()){
                        stack.pop();
                        k--;
                    }
                    stack.push(number.charAt(i) - '0');
            }
        while(k>0){
            stack.pop();
            k--;
        }
        Stack<Integer> st = new Stack<>();
        while(!stack.isEmpty()){
            st.push(stack.pop());
        }
        StringBuilder str = new StringBuilder();
        while(!st.isEmpty()){
            str.append(st.pop());
        }
        return str.toString();
    }
}