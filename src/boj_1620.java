import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class boj_1620 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int tc = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> nameToNum = new HashMap<>();
        HashMap<Integer, String> numToName = new HashMap<>();

        for (int i = 1; i <= tc; i++) {
            String name = br.readLine();
            nameToNum.put(name, i);
            numToName.put(i, name);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String query = br.readLine();
            if (isNumeric(query)) {
                int number = Integer.parseInt(query);
                sb.append(numToName.get(number));
            } else {
                sb.append(nameToNum.get(query));
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}