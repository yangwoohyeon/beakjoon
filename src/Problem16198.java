import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Problem16198 {
    static ArrayList<Integer> list=new ArrayList<>();
    static int N;
    static int Max=Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        for(int i=0; i<N; i++){
            int n=scanner.nextInt();
           list.add(n);
        }

        dfs(0);
        System.out.println(Max);

    }
    static void dfs(int value){
        if(list.size()==2){
            if(value>Max){
                Max=value;
            }
            return;
        }
       for(int i=1; i<list.size()-1; i++){
           int energy=(list.get(i-1)*list.get(i+1));
           int n=list.remove(i);
           dfs(value+energy);
           list.add(i,n);
       }
    }
}
