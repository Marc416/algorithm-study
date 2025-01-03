package taewon_kim_inflearn._08_DFS_BFS_basic;

import java.util.Scanner;

public class _8_12_경로탐색_DFS {
    static int n, m, answer = 0;
    static int[][] graph;
    static int[] ch;

    private void DFS(int v) {
        if (v == n) answer++;
        else {
            for (int i = 1; i < n+1; i++) {
                if (ch[i] == 0 && graph[v][i] == 1) {
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        _8_12_경로탐색_DFS Main = new _8_12_경로탐색_DFS();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new int[n + 1][n + 1];
        ch = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();

            graph[a][b] = 1;
        }
        ch[1] = 1;
        Main.DFS(1);
        System.out.println(answer);
    }
}

/**
5 9
1 2
1 3
1 4
2 1
2 3
2 5
3 4
4 2
4 5
 */