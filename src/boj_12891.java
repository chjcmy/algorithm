import java.util.*;

public class boj_12891 {
    static int[] arr, cnt;

    static boolean isOk() {
        return cnt['A']>=arr[0] && cnt['C']>=arr[1] && cnt['G']>=arr[2] && cnt['T']>=arr[3];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[] input = sc.next().toCharArray();

        cnt = new int['Z'];
        arr = new int[4];
        for (int i=0; i<4; ++i)
            arr[i] = sc.nextInt();

        int ans = 0;
        for (int i=0; i<m; ++i)
            cnt[input[i]]++;

        if (isOk()) ++ans;

        for (int i=m; i<n; ++i) {
            --cnt[input[i-m]];
            ++cnt[input[i]];
            if (isOk()) ++ans;
        }
        System.out.println(ans);

    }

}