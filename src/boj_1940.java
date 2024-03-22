import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj_1940 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int N = Integer.parseInt(br.readLine());
            int M = Integer.parseInt(br.readLine());
            int[] arr = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            Arrays.sort(arr);

            int start = 0;
            int end = N - 1;
            int answer = 0;

                while (start < end) {

                    int sum = arr[start] + arr[end];

                    if(sum == M) {
                        answer++;
                        start++;
                        end--;
                    } else if (sum < M) {
                        start++;
                    } else {
                        end--;
                    }

                }

            System.out.println(answer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
