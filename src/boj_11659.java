import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj_11659 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            int[] arr = new int[n];
            input = br.readLine().split(" ");
            arr[0] = Integer.parseInt(input[0]);
            for (int i = 1; i < n; i++) {
                arr[i] = arr[i - 1] + Integer.parseInt(input[i]);
            }
            for (int i = 0; i < m; i++) {
                input = br.readLine().split(" ");
                int start = Integer.parseInt(input[0]) - 2;
                int end = Integer.parseInt(input[1]) - 1;
                if (start < 0) {
                    System.out.println(arr[end]);
                } else {
                    System.out.println(arr[end] - arr[start]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
