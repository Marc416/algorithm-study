package taewon_kim_inflearn._9_DFS_BFS_practice;

import java.util.Scanner;

public class _9_2_바둑이승차_DFS {
    static int c, n;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        _9_2_바둑이승차_DFS Main = new _9_2_바둑이승차_DFS();
        Scanner kb = new Scanner(System.in);
        c = kb.nextInt();
        n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        Main.DFS(0, 0, arr);
        System.out.println(max);
    }

    public void DFS(int L, int sum, int[] arr) {
        if (sum > c) return;
        if (L == n) {
            max = Math.max(sum, max);
            return;
        } else {
            DFS(L + 1, sum + arr[L], arr);
            DFS(L + 1, sum, arr);
        }
    }
}
