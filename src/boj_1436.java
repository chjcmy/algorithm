import java.util.Scanner;
import java.io.IOException;

public class boj_1436 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cnt = s.nextInt();
		
		for (int i = 666; true; i++) {
			String now = i + "";
			if (now.contains("666")) {
				cnt--;
			}
			if (cnt == 0) {
				System.out.println(now);
				break;
			}
		}
	}
}