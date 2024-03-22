import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj_2018 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int N = Integer.parseInt(br.readLine());

            int answer = 0;
            int end = 0;
            int sum = 0;

            for (int start = 1; start <= N; start++) {
                while (sum < N && end <= N) {
                    end++;
                    sum += end;
                }
                if (sum == N) {
                    answer++;
                }
                sum -= start;
            }

            System.out.println(answer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
