import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_10986 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] input = br.readLine().split(" ");

            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);

            long[] S = new long[N];
            long[] C = new long[M];

            long answer = 0;

            input = br.readLine().split(" ");

            for (int i = 1; i < N; i++) {
                S[i] = S[i - 1] + Integer.parseInt(input[i - 1]);
            }

            for (int i = 0; i < N; i++) {
                int remainder = (int) (S[i] % M);

                if (remainder == 0) answer++;

                C[remainder]++;
            }

            for (int i = 0; i < M; i++) {
                if(C[i] > 1) {
                    answer = answer + (C[i] * ( C[i] - 1) / 2 );
                }
            }

            System.out.println(answer);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
