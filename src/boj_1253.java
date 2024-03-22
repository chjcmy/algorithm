import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj_1253 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int N = Integer.parseInt(br.readLine());

            int[] arr = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .sorted()
                    .toArray();

            int answer = 0;

            for (int i = 0; i < N; i++) {

                int find = arr[i];
                int start = 0;
                int end = N - 1;


                while(start < end) {
                   if (find == arr[start] + arr[end]) {
                       if (start != i && end != i) {
                           answer++;
                           break;
                       } else if (start == i){
                           start++;
                       } else {
                           end--;
                       }
                   } else if (arr[start] + arr[end] < find) {
                       start++;
                   } else {
                       end--;
                   }
                }
            }
            System.out.println(answer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
