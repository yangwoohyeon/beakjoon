class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer=0;
        for(int i=0; i<skill_trees.length; i++){
            StringBuilder str = new StringBuilder();
            for(int j=0; j<skill_trees[i].length(); j++){
                char c = skill_trees[i].charAt(j);
                if(checkExist(c,skill)){
                    str.append(c);
                }
            }
            String s =str.toString();
            if(checkOrder(skill,s)){
                answer++;
            }
        }
        return answer;
    }
    
    public boolean checkExist(char c, String skill){
        for(int i=0; i<skill.length(); i++){
            if(c==skill.charAt(i)){
                return true;
            }
        }
        return false;
    }
    public boolean checkOrder(String skill, String s){
        for(int i=0; i<s.length(); i++){
            if(skill.charAt(i)!=s.charAt(i)){
                return false;
            }
        }
        return true;
    }
}