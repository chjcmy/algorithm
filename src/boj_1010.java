import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1010 {
	
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			String[] input = br.readLine().split(" ");
			
			int N = Integer.parseInt(input[0]);
			int M = Integer.parseInt(input[1]);
			
			System.out.println(Combination(M, N));
			
		}
	}
	
	public static long Combination(int M, int N) {
		
		long numerator = 1;
		long denominator = 1;
		
		N = Math.min(N, M-N);
		
		for (int i = 0; i < N; i++) {
			numerator *= M - i;
			denominator *= N - i;
			
			long gcd = gcd(numerator, denominator);
			
			numerator /= gcd;
			denominator /= gcd;
		}
		
		return numerator/denominator;
	}
	
	static long gcd(long a, long b) {
		while(b != 0) {
			long r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}
