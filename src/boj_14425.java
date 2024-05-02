import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class boj_14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int M = Integer.parseInt(input[0]);
        int S = Integer.parseInt(input[1]);

        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i < M; i++) {
            hashSet.add(br.readLine());
        }

        String[] strings = new String[S];

        for (int i = 0; i < S; i++) {
            strings[i] = br.readLine();
        }

        int count = 0;

        for (int i = 0; i < S; i++) {
            if (hashSet.contains(strings[i])) count++;
        }

        System.out.println(count);
    }
}
