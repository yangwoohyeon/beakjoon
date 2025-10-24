class Solution {
    public int solution(String s) {
        StringBuilder str = new StringBuilder();
        int position=0;
        while(position<s.length()){
            if(Character.isDigit(s.charAt(position))){
                str.append(s.charAt(position));
                position++;
                continue;
            }
            else{
                if(position+4<=s.length() && s.substring(position,position+4).equals("zero")){
                    str.append('0');
                    position+=4;
                }
                else if(position+3<=s.length() && s.substring(position,position+3).equals("one")){
                    str.append('1'); 
                    position+=3;
                }
                else if(position+3<=s.length() && s.substring(position,position+3).equals("two")){
                    str.append('2');
                    position+=3;
                }
                else if(position+5<=s.length() && s.substring(position,position+5).equals("three")){
                    str.append('3');
                    position+=5;
                }
                else if(position+4<=s.length() && s.substring(position,position+4).equals("four")){
                    str.append('4');
                    position+=4;
                }
                else if(position+4<=s.length() && s.substring(position,position+4).equals("five")){
                    str.append('5');
                    position+=4;
                }
                else if(position+3<=s.length() && s.substring(position,position+3).equals("six")){
                    str.append('6');
                    position+=3;
                }
                else if(position+5<=s.length() && s.substring(position,position+5).equals("seven")){
                    str.append('7');
                    position+=5;
                }
                else if(position+5<=s.length() && s.substring(position,position+5).equals("eight")){
                    str.append('8');
                    position+=5;
                }
                else if(position+4<=s.length() && s.substring(position,position+4).equals("nine")){
                    str.append('9');
                    position+=4;
                }
            }
        }
        
        return Integer.parseInt(str.toString());
    }
}