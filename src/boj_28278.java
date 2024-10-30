import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;

public class boj_28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        LinkedList<Integer> list = new LinkedList<>();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <N ; i++) {
            String[] strArr = br.readLine().split(" ");

            int command = Integer.parseInt(strArr[0]);
            switch (command) {
                case 1: // Push
                    int num = Integer.parseInt(strArr[1]);
                    stack.push(num);
                    break;
                case 2: // Pop
                    if (!stack.isEmpty()) {
                        System.out.println(stack.pop());
                    } else {
                        System.out.println("-1");
                    }
                    break;
                case 3: // Size
                    System.out.println(stack.size());
                    break;
                case 4: // Is Empty
                    if (!stack.isEmpty()) {
                        System.out.println("0");
                    } else {
                        System.out.println("1");
                    }
                    break;
                case 5: // Top
                    if (!stack.isEmpty()) {
                        System.out.println(stack.peek());
                    } else {
                        System.out.println("-1");
                    }
                    break;
            }
        }
    }
}