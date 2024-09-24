import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class boj_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int[] intArr = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            intArr[i] = Character.getNumericValue(str.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            int Max = i;
            for (int j = i + 1; j < str.length(); j++) {
                if (intArr[j] > intArr[Max]) {
                    Max = j;
                }
            }
            if (intArr[i] < intArr[Max]) {
                int temp = intArr[i];
                intArr[i] = intArr[Max];
                intArr[Max] = temp;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.print(intArr[i]);
        }
    }
}