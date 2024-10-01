import java.util.Scanner;

public class Problem1541 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input =scanner.nextLine();
        String[] sub = input.split("-");
        int result = Integer.MAX_VALUE;

        for(int i=0; i<sub.length; i++){
            int sum = 0;
            String[] addition = sub[i].split("\\+");
            for(int j=0; j<addition.length; j++){
                sum+=Integer.parseInt(addition[j]);
            }
            if(result==Integer.MAX_VALUE){
                result=sum;
            }
            else{
                result-=sum;
            }
        }

        System.out.println(result);
    }
}
