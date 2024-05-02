import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj_2750 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(br.readLine());

            int[] A = new int[n];

            for (int i = 0; i < n; i++) {
                A[i] = Integer.parseInt(br.readLine());
            }

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1 - i; j++) {
                    if (A[j] > A[j + 1]) {
                        int temp = A[j];
                        A[j] = A[j + 1];
                        A[j + 1] = temp;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.println(A[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
