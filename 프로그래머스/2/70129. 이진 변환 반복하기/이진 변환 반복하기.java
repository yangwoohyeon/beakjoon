class Solution {
    int count=0; //0제거 횟수
    public int[] solution(String s) {
        int[] answer = new int[2];
        int con = 0;
        
        while(true){
            if(s.equals("1")){
                break;
            }
            s = remove(s);
            con++;
            
        }
        answer[0]= con;
        answer[1]=count;
        
        
        
        return answer;
    }
    
    public String remove(String s){
        StringBuilder str = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='0'){
                count++;
            }
            else{
                str.append('1');
            }
        }
        String a = str.toString();
        int len = a.length(); //1의 개수
        String binary = Integer.toString(len,2); //1의 개수를 2진수로 변환
        return binary;
        
        
    }
}