class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String Ternary = Integer.toString(n,3);
        StringBuilder str = new StringBuilder(Ternary);
        String reTernary = str.reverse().toString();
        answer = Integer.parseInt(reTernary,3);
        return answer;
    }
}