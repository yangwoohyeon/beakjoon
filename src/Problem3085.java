import java.util.Scanner;

public class Problem3085 {
    static char[][] arr;
    static int N;
    static int max=1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        arr=new char[N][N];

        for(int i=0; i<N; i++){
            String s=scanner.next();
            for(int j=0; j<N; j++){
                arr[i][j]=s.charAt(j);
            }
        }
        //행을 기준으로 오른쪽과 비교
        for(int i=0; i<N; i++){
            for(int j=0; j<N-1; j++){
                swap(i,j,i,j+1);
                search();
                swap(i,j+1,i,j);
            }
        }

        //열 기준으로 아래와 비교
        for(int i=0; i<N-1; i++){
            for(int j=0; j<N; j++){
                swap(i,j,i+1,j);
                search();
                swap(i+1,j,i,j);
            }
        }
        System.out.println(max);

    }

    public static void swap(int x,int y, int a , int b){
        char tmp=arr[x][y];
        arr[x][y]=arr[a][b];
        arr[a][b]=tmp;
    }

    public static void search(){
        //행마다 비교
        for(int i=0; i<N; i++){
            int count =1;

            //옆이랑 비교
            for(int j=0; j<N-1; j++){
                if(arr[i][j]==arr[i][j+1]){
                    count++;
                    max=Math.max(count,max);
                }
                else{
                    count=1;
                }
            }
        }

        //열마다 비교
        for(int i=0; i<N; i++){
            int count=1;
            for(int j=0; j<N-1; j++){
                if(arr[j][i]==arr[j+1][i]){
                    count++;
                    max=Math.max(count,max);
                }
                else{
                    count=1;
                }
            }
        }
    }

}
