package taewon_kim_inflearn._9_DFS_BFS_practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _9_5_동전교환_DFS {
    static int n, m;
    static Integer[] coin;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        _9_5_동전교환_DFS Main = new _9_5_동전교환_DFS();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        coin = new Integer[n];
        for (int i = 0; i < n; i++) {
            coin[i] = kb.nextInt();
        }
        Arrays.sort(coin, Collections.reverseOrder());
        m = kb.nextInt();
        Main.DFS(0, 0, 0);
        System.out.println(min);
    }

    public void DFS(int L, int sum, int coinCount) {
        if (sum > m) return;
        if (coinCount > min) return;
        if (sum == m) {
            min = Math.min(coinCount, min);
        } else {
            for (int i : coin) {
                DFS(L + 1, sum + i, coinCount + 1);
            }
        }

    }
}
