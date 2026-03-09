import java.util.*;

public class Main {

    static int K, N;
    static int[] arr;

    static void dfs(int depth){

        if(depth == N){
            for(int i = 0; i < N; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 1; i <= K; i++){
            arr[depth] = i;
            dfs(depth + 1);
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        K = sc.nextInt();
        N = sc.nextInt();

        arr = new int[N];

        dfs(0);
    }
}