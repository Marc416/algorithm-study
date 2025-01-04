package taewon_kim_inflearn._9_DFS_BFS_practice;

import java.util.Scanner;

public class _9_3_최대점수구하기_DFS {
    static int n, m;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        _9_3_최대점수구하기_DFS Main = new _9_3_최대점수구하기_DFS();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = kb.nextInt();
            arr[i][1] = kb.nextInt();
        }

        Main.DFS(0, 0, 0, arr);
        System.out.println(max);
    }

    public void DFS(int L, int sum, int time, int[][] arr) {
        if (time > m) return;
        if (L == n) {
            max = Math.max(max, sum);
            return;
        } else {
            DFS(L + 1, sum + arr[L][0], time + arr[L][1], arr);
            DFS(L + 1, sum, time, arr);
        }
    }

}
