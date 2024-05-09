import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class sw_1249 {
		public static void main(String[] args) throws FileNotFoundException {
			
			System.setIn(new FileInputStream("./src/1249.txt"));
			Scanner sc = new Scanner(System.in);
			
			for (int i = 1; i <= 10; i++) {
				int N = sc.nextInt();
				
				int[][] arr = new int[N][N];
				
				for (int j = 0; j < N; j++) {
					StringTokenizer st = new StringTokenizer(sc.nextLine());
					for (int k = 0; k < N; k++) {
						arr[j][k] = Integer.parseInt(st.nextToken());
					}
				}
				
				int answer = 0;
				int x = 0;
				int y = 0;
				
				while(x != N - 1 && y != N - 1) {
					int xNum = 0;
					int yNum = 0;
					for (int j = x; j < N; j++) {
						xNum += arr[x][j];
					}
					for (int j = y; j < N; j++) {
						yNum += arr[j][y];
					}
					if(xNum < yNum ) {
						x++;
					} else if (yNum < xNum) {
						y++;
					} else {
					
					}
				}
		}
	}
}
