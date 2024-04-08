import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class boj_1874 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int n = Integer.parseInt(br.readLine());

            int[] sequence = new int[n];
            for (int i = 0; i < n; i++) {
                sequence[i] = Integer.parseInt(br.readLine());
            }

            Stack<Integer> stack = new Stack<Integer>();
            ArrayList<String> result = new ArrayList<>();

            int idx = 0;
            for (int i = 1; i <= n; i++) {
                stack.push(i);
                result.add("+");

                while (!stack.isEmpty() && stack.peek() == sequence[idx]) {
                    stack.pop();
                    result.add("-");
                    idx++;
                }
            }

            if (!stack.isEmpty()) {
                System.out.println("NO");
            } else {
                for (String str:
                     result ) {
                    System.out.println(str);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
