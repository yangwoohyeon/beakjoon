import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] student1 = {1,2,3,4,5};
        int[] student2 = {2,1,2,3,2,4,2,5};
        int[] student3 = {3,3,1,1,2,2,4,4,5,5};
        int a1 = check(student1,answers);
        int a2 = check(student2,answers);
        int a3 = check(student3,answers);
        int max  = Math.max(a1,Math.max(a2,a3));
        List<Integer> list = new ArrayList<>();
        if(a1==max){
            list.add(1);
        }
        if(a2==max){
            list.add(2);
        }
        if(a3==max){
            list.add(3);
        }
        int[] arr= new int[list.size()];
        for(int i=0; i<list.size(); i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
    
    public int check(int[] student, int[] answers ){
        int size = student.length;
        int count=0;
        int pos=0;
        for(int i=0; i<answers.length; i++){
            if(answers[i]==student[pos]){
                count++;
            }
            pos++;
            if(pos>=size){
                pos=0;
            }
        }
        return count;
    }
}