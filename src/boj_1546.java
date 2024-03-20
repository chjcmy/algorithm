import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj_1546 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int n = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            double max = 0;
            double sum = 0;
            for (int i = 0; i < n; i++) {
                double score = Double.parseDouble(input[i]);
                if (score > max) {
                    max = score;
                }
                sum += score;
            }
            System.out.println(sum / max * 100 / n);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
