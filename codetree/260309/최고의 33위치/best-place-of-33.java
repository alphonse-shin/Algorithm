import java.util.Scanner;

public class Main {

    private static int N;
    private static int[][]grid;
    private static int sum;
    private static int max;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        grid = new int[N][N];

        for(int i =0; i <N; i++){
            for(int j=0; j<N; j++){
                grid[i][j] = sc.nextInt();
            }
        }//grid입력

        max = Integer.MIN_VALUE;

        //3x3의 왼쪽 위 좌표 잡기
        for(int r =0; r <=N-3; r++ ){
            for(int c=0; c <= N-3; c++){

                sum =0;

                //3x3 그리드 안 동전의 개수 합 세기
                for(int i = r; i< r+3; i++){
                    for(int j = c; j<c+3; j++){
                        sum += grid[i][j];
                    }
                }

                //최댓값 구하기
                max = Math.max(sum,max);
            }
        }

        System.out.println(max);

    }//main
}
