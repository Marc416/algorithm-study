package taewon_kim_inflearn._9_DFS_BFS_practice;

import java.util.Scanner;

// 조합은 외워버리는게 좋음

public class _9_9_조합구하기_2 {
    static int[] combi;
    static int n, m;

    public void DFS(int L, int s) {
        if (L == m) {
            for (int x : combi) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = s; i <= n; i++) {
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        _9_9_조합구하기_2 T = new _9_9_조합구하기_2();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        combi = new int[m];
        T.DFS(0, 1);
    }
}
