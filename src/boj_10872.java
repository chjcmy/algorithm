import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_10872 {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(Factory(N));
	}
	
	static int Factory(int a) {
		
		if(a <= 1) {
			return 1;
		}
		
		return a  * Factory(a - 1);
	}
}
