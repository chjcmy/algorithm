import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj_11660 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);

            int[][] maze = new int[N+1][N+1];

            for (int i = 1; i <= N; i++) {
                input = br.readLine().split(" ");
                for (int j = 1; j <= N; j++) {
                    maze[i][j] = Integer.parseInt(input[j-1]) + maze[i-1][j] + maze[i][j-1] - maze[i-1][j-1];
                }
            }

            for (int i = 0; i < M; i++) {
                input = br.readLine().split(" ");
                int x1 = Integer.parseInt(input[0]);
                int y1 = Integer.parseInt(input[1]);
                int x2 = Integer.parseInt(input[2]);
                int y2 = Integer.parseInt(input[3]);

                System.out.println(maze[x2][y2] - maze[x1-1][y2] - maze[x2][y1-1] + maze[x1-1][y1-1]);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}