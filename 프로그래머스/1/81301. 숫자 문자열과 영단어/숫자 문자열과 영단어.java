class Solution {
    public int solution(String s) {
        int answer = 0;
        int pos = 0;
        StringBuilder str = new StringBuilder();
        while(true){
            if(pos>=s.length()){
                break;
            }
            if(Character.isDigit(s.charAt(pos))){
                str.append(s.charAt(pos));
                pos++;
            }
            else{
                if(s.charAt(pos)=='z'){
                    str.append('0');
                    pos+=4;
                }
                else if(s.charAt(pos)=='o'){
                    str.append('1');
                    pos+=3;
                }
                else if(s.charAt(pos)=='t'){
                    if(s.substring(pos,pos+3).equals("two")){
                        str.append('2');
                        pos+=3;
                    }
                    else{
                        str.append('3');
                        pos+=5;
                    }
                }
                else if(s.charAt(pos)=='f'){
                    if(s.substring(pos,pos+4).equals("four")){
                        str.append('4');
                        pos+=4;
                    }
                    else{
                        str.append('5');
                        pos+=4;
                    }
                }
                else if(s.charAt(pos)=='s'){
                    if(s.substring(pos,pos+3).equals("six")){
                        str.append('6');
                        pos+=3;
                    }
                    else{
                        str.append('7');
                        pos+=5;
                    }
                }
                else if(s.charAt(pos)=='e'){
                    str.append('8');
                    pos+=5;
                }
                else if(s.charAt(pos)=='n'){
                    str.append('9');
                    pos+=4;
                }
            }
        }
        
        String num = str.toString();
        answer = Integer.parseInt(num);
        
        return answer;
    }
}