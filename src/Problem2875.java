import java.util.Scanner;

public class Problem2875 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();

        int sum = N+M-K; // 총원에서 인턴을 하는 학생수를 뺀 학생수

        sum=sum/3; //남은 학생수로 만들 수 있는 최대 팀 수
        int team=sum;
        int Man = sum; // 최대 팀수에 최대로 들어갈 수 있는 남학생 수
        int Woman = 2*sum; // 최대 팀수에 최대로 들어갈 수 있는 여학생 수

        if(N<Woman){ //현 인원보다 최대 여학생 수가 클 경우 ==> 최대 팀 수를 만들 수 없다.
            while(true){
                Woman-=2;
                team--;
                if(N>=Woman){
                    break;
                }
            }
        }

        if(M<Man){ //현 인원보다 최대 남학생 수가 클 경우 ==> 최대 팀 수를 만들 수 없다.
            while(true){
                Man-=1;
                team--;
                if(M>=Man){
                    break;
                }
            }
        }

        System.out.println(team);

    }
}
