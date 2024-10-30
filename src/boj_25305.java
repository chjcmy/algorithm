import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class boj_25305 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strArr = br.readLine().split(" ");

        int a = Integer.parseInt(strArr[0]);
        int b = Integer.parseInt(strArr[1]);
        Integer[] arr = new Integer[a];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < a; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(arr[b-1]);
    }
}
