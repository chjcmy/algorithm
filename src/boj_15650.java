import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_15650 {
	static int N, M;
	static int[] arr;
	static boolean[] visited;
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		visited = new boolean[N];
		
		dfs(0, 1);
	}
	
	static void dfs(int depth, int start) throws IOException {
		if(depth == M) {
			for (int i = 0; i < M; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		for (int i = start; i <= N; i++) {
			if(!visited[i - 1])  {
				visited[i - 1] = true;
				arr[depth] = i;
				dfs(depth + 1, i + 1);
				visited[i - 1] = false;
			}
		}
	}
}
