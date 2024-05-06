import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class sw_1210 {
	public static void main(String[] args) throws FileNotFoundException {
		
		System.setIn(new FileInputStream("./src/1210.txt"));
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i <= 10; i++) {
			int[][] ints = new int[101][101];
			sc.nextLine(); // 테스트 케이스 번호 읽기
			
			int answer = 0;
			int x = 100;
			
			
			for (int k = 0; k < 100; k++) {
				String line = sc.nextLine();
				StringTokenizer st = new StringTokenizer(line);
				
				for (int j = 0; j < 100; j++) {
					int a = Integer.parseInt(st.nextToken());
					if (a == 2) {
						answer = j;
						x = k;
					}
					ints[k][j] = a;
				}
			}
			
			
			while (x > 0) { // x가 0이 되면 맨 위에 도달한 것입니다.
				if (answer > 0 && ints[x][answer - 1] == 1) { // 왼쪽으로 이동 가능한지 확인
					while (answer > 0 && ints[x][answer - 1] == 1) {
						answer--;
					}
					x--; // 왼쪽으로 이동 후 위로 한 칸 이동
				} else if (answer < 99 && ints[x][answer + 1] == 1) { // 오른쪽으로 이동 가능한지 확인
					while (answer < 99 && ints[x][answer + 1] == 1) {
						answer++;
					}
					x--; // 오른쪽으로 이동 후 위로 한 칸 이동
				} else {
					x--; // 좌우 이동이 불가능하면 위로 이동
				}
			}

			
			System.out.println("#" + i + " " + answer);
		}
	}
}
