import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Hearable {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputLine = br.readLine().split(" "); // N, M 입력 받기

        int N = Integer.parseInt(inputLine[0]);
        int M = Integer.parseInt(inputLine[1]);

        HashSet<String> hearableNames = new HashSet<>();

        for (int i = 0; i < N; i++) {
            hearableNames.add(br.readLine());
        }
        ArrayList<String> hearAndSeeNotList = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (hearableNames.contains(name)) {
                hearAndSeeNotList.add(name);
            }
        }

        Collections.sort(hearAndSeeNotList);

        bw.write(String.valueOf(hearAndSeeNotList.size()));
        bw.newLine(); // 개행 추가

        for (String name : hearAndSeeNotList) {
            bw.write(name);
            bw.newLine();
        }
        bw.flush(); // 버퍼 내용 출력
    }
}

