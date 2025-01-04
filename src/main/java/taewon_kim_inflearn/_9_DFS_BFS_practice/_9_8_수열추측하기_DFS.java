package taewon_kim_inflearn._9_DFS_BFS_practice;

import java.util.Scanner;

public class _9_8_수열추측하기_DFS {
    static int n, m;
    static int[][] combiDy;
    static int[] cdy, ch, answer;
    static boolean flag = false;

    public static void main(String[] args) {
        _9_8_수열추측하기_DFS Main = new _9_8_수열추측하기_DFS();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        cdy = new int[n + 1];
        ch = new int[n + 1];
        answer = new int[n];
        combiDy = new int[n + 1][n + 1];
        for (int i = 0; i < n; i++) {
            cdy[i] = Main.combi(n - 1, i);
        }
        Main.DFS(0, 0);
    }

    public int combi(int n, int r) {
        if (combiDy[n][r] > 0) return combiDy[n][r];
        if (n == r || r == 0) {
            return 1;
        } else {
            return combiDy[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
        }
    }

    public void DFS(int L, int sum) {
        if (flag) return;
        if (L == n) {
            if (sum == m) {
                flag = true;
                for (int i : answer) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            return;
        } else {
            for (int i = 1; i < n + 1; i++) {
                if (ch[i] > 0) continue;
                ch[i] = 1;
                answer[L] = i;
                DFS(L + 1, sum + cdy[L] * i);
                ch[i] = 0;
            }
        }
    }
}
