import java.util.*;
class Solution {
    ArrayList<String> list = new ArrayList<>();
    boolean[] visit;
    public String[] solution(String[][] tickets) {
        visit = new boolean[tickets.length];
        dfs(tickets,"ICN","ICN",0);
        Collections.sort(list);
        String[] answer = list.get(0).split(" ");
        return answer;
        
    }
    
    public void dfs(String[][] tickets, String start, String route, int count){
        if(tickets.length==count){
            list.add(route);
            return;
        }
        for(int i=0; i<tickets.length; i++){
            if(!visit[i] && tickets[i][0].equals(start)){
                visit[i]=true;
                dfs(tickets,tickets[i][1], route+" "+tickets[i][1],count+1);
                visit[i]=false;
            }
        }
    }
    
}