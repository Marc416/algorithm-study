package taewon_kim_inflearn._9_DFS_BFS_practice;

import java.util.Scanner;

public class _9_7_조합의_경우의_수_메모리제이션 {
    static int n, r;
    static int[][] dy;

    public static void main(String[] args) {
        _9_7_조합의_경우의_수_메모리제이션 Main = new _9_7_조합의_경우의_수_메모리제이션();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        r = kb.nextInt();
        dy = new int[n + 1][n + 1];
        System.out.println(Main.DFS(n, r));
    }

    public int DFS(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (n == r || r == 0) {
            return 1;
        } else {
            return dy[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
        }
    }

}
