import java.util.Scanner;

public class Problem1780 {
    static int N;
    static int[][] arr;
    static int x=0; //-1
    static int y=0; //0
    static int z=0; //1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N=scanner.nextInt();
        arr=new int[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        partition(0,0,N);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

    public static void partition(int row, int col, int size){ //-1,0,1의 갯수 카운트, 재귀함수
        if(numCheck(row,col,size)){
            if(arr[row][col]==-1){
                x++;
            }
            else if(arr[row][col]==0){
                y++;
            }
            else{
                z++;
            }
            return;
        }
        else{
            int newSize=size/3;
            partition(row,col,newSize); //왼쪽 맨위
            partition(row,col+newSize,newSize); //맨위 중앙
            partition(row,col+newSize*2,newSize); // 맨위 오른쪽
            partition(row+newSize,col,newSize); //중앙 왼쪽
            partition(row+newSize,col+newSize,newSize); //중앙
            partition(row+newSize,col+newSize*2,newSize); //중앙 오른쪽
            partition(row+newSize*2,col,newSize); //맨 아래 왼쪽
            partition(row+newSize*2,col+newSize,newSize); //맨 아래 중앙
            partition(row+newSize*2,col+newSize*2,newSize); //맨 아래 오른쪽
        }
    }

    public static boolean numCheck(int row, int col, int size){ //종이가 모두 같은 수로 이루어져 있는지 체크
        int num = arr[row][col];

        for(int i=row; i<row+size; i++){
            for(int j=col; j<col+size; j++){
                if(num!=arr[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
