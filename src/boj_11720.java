import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj_11720 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int n = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split("");
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += Integer.parseInt(input[i]);
            }
            System.out.println(sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
