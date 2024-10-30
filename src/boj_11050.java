import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        System.out.println(bonomial(n,m));

    }

    static int bonomial(int n, int r){
        if(r == 0 || n == r )
            return 1;
        return bonomial(n-1,r)+bonomial(n-1,r-1);
    }
}
