import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        
        int[] ans = new int[3];
        int a_idx = 0;
        int b_idx = 0;
        int c_idx = 0;
        for(int i=0; i<answers.length; i++){
            if(a[a_idx]==answers[i]){
                ans[0]++;
            }
            if(b[b_idx]==answers[i]){
                ans[1]++;
            }
            if(c[c_idx]==answers[i]){
                ans[2]++;
            }
            a_idx++;
            b_idx++;
            c_idx++;
            if(a_idx>=a.length){
                a_idx=0;
            }
            if(b_idx>=b.length){
                b_idx=0;
            }
            if(c_idx>=c.length){
                c_idx=0;
            }
        }
        int max = ans[0];
        for(int i=0; i<3; i++){
            if(ans[i]>max){
                max=ans[i];
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<3; i++){
            if(max==ans[i]){
                queue.add(i+1);
            }
        }
        int size=queue.size();
        int[] answer = new int[size];
        for(int i=0; i<size; i++){
            answer[i]=queue.poll();
        }
        return answer;
    }
}