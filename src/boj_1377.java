/*
* 문제 출처: Baekjoon Online Judge, No. 1377
* 문제 제목: 버블 소트
* 문제 요약: C++로 되어 있는 버블 소트 알고리즘을 푸는 문제

* 사용한 알고리즘: 버블 소트

* 어려웠던 점:
    1. 안쪽 for 문이 몇번 수행됐는지 구하는 아이디어를 찾기 가 힘들었다.

* 해결에 소요된 시간: 30분

* 개선점:
    1. 코드를 더 간결하게 작성할 수 있는 방법
    2. 다른 알고리즘을 적용하여 시간 복잡도를 개선할 수 있는 방법

* 시간 복잡도: O(NLogN)
* 공간 복잡도: O(N)
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj_1377 {
    public static void main(String[] args) {
        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(br.readLine());

            mData[] A = new mData[N];

            for(int i = 0; i < N; i++) {
                A[i] = new mData(Integer.parseInt(br.readLine()), i);
            }
            Arrays.sort(A);
            int Max = 0;
            for (int i = 0; i < N; i++) {
                if (Max < A[i].index - i)
                    Max = A[i].index - i;
            }
            System.out.println(Max + 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class mData implements Comparable<mData> {
        int index;
        int value;

        public mData(int value, int index) {
            super();
            this.value = value;
            this.index = index;
        }

        @Override
        public int compareTo(mData o) {
            return this.value - o.value;
        }
    }
}
