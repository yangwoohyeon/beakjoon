class Solution {
    public int[] solution(long n) {
        long m= n;
        int[] answer = {};
        int size=0;
        while(n>0){
            n=n/10;
            size++;
        }
        answer = new int[size];
        int i=0;
        while(m>0){
            long x = m%10;
            answer[i++]=(int)x;
            m=m/10;
        }
        return answer;
    }
}