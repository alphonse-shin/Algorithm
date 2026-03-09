import java.util.Scanner;

public class Main {

    static int N, M;
    static int[][] grid;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        grid = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int answer = 0;

        // 각 행 검사
        for (int i = 0; i < N; i++) {
            if (isHappyRow(i)) {
                answer++;
            }
        }

        // 각 열 검사
        for (int j = 0; j < N; j++) {
            if (isHappyCol(j)) {
                answer++;
            }
        }

        System.out.println(answer);
    }

    // row번째 행이 행복한 수열인지 판별
    static boolean isHappyRow(int row) {
        int count = 1; // 현재 연속 개수

        for (int j = 1; j < N; j++) {
            if (grid[row][j] == grid[row][j - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count >= M) {
                return true;
            }
        }

        // M이 1인 경우도 처리됨
        return M == 1;
    }

    // col번째 열이 행복한 수열인지 판별
    static boolean isHappyCol(int col) {
        int count = 1; // 현재 연속 개수

        for (int i = 1; i < N; i++) {
            if (grid[i][col] == grid[i - 1][col]) {
                count++;
            } else {
                count = 1;
            }

            if (count >= M) {
                return true;
            }
        }

        return M == 1;
    }
}