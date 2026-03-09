import java.util.Scanner;

public class Main {

    static int N;
    static int count = 0;

    static void dfs(int len){

        if(len == N){
            count++;
            return;
        }

        if(len > N) return;

        for(int i = 1; i <= 4; i++){
            dfs(len + i);
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        dfs(0);

        System.out.println(count);
    }
}