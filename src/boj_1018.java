import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1018 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] firstLine = br.readLine().split(" ");
		int N = Integer.parseInt(firstLine[0]);
		int M = Integer.parseInt(firstLine[1]);
		char[][] board = new char[N][M];
		
		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			for (int j = 0; j < M; j++) {
				board[i][j] = line.charAt(j);
			}
		}
		
		int minRepaints = Integer.MAX_VALUE;
		
		for (int i = 0; i <= N - 8; i++) {
			for (int j = 0; j <= M - 8; j++) {
				int repaintCount = calculateRepaints(board, i, j);
				minRepaints = Math.min(minRepaints, repaintCount);
			}
		}
		
		System.out.println(minRepaints);
	}
	
	private static int calculateRepaints(char[][] board, int x, int y) {
		int endX = x + 8;
		int endY = y + 8;
		int repaintsB = 0;
		int repaintsW = 0;
		
		for (int i = x; i < endX; i++) {
			for (int j = y; j < endY; j++) {
				if ((i + j) % 2 == 0) {
					if (board[i][j] != 'B') repaintsB++;
					if (board[i][j] != 'W') repaintsW++;
				} else {
					if (board[i][j] != 'W') repaintsB++;
					if (board[i][j] != 'B') repaintsW++;
				}
			}
		}
		
		return Math.min(repaintsB, repaintsW);
	}
}
