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
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		visited = new boolean[N];
		
		dfs(0, 1);
	}
	
	static void dfs(int depth, int start) {
		if(depth == M) {
			for (int i = start; i < depth; i++) {
			
			}
		}
	}
}
