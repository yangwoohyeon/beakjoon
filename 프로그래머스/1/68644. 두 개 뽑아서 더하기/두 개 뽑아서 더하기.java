import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                set.add(numbers[i]+numbers[j]);
            }
        }
        Integer[] answer = set.toArray(new Integer[0]);
        Arrays.sort(answer);
        int[] arr = new int[answer.length];
        for(int i=0; i<arr.length; i++){
            arr[i]=answer[i];
        }
        return arr;
    }
}