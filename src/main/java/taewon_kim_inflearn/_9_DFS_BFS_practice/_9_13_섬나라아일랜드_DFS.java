package taewon_kim_inflearn._9_DFS_BFS_practice;

import java.util.Scanner;

public class _9_13_섬나라아일랜드_DFS {
    static int n;
    static int[][] board;
    static int[] dx = {0, 1, -1, 0, 1, -1, 1, -1};
    static int[] dy = {1, 0, 0, -1, 1, -1, -1, 1};
    static int count = 0;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        _9_13_섬나라아일랜드_DFS Main = new _9_13_섬나라아일랜드_DFS();
        n = kb.nextInt();
        board = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = kb.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) continue;
                if (board[i][j] == 1) {
                    board[i][j] = 0;
                    count += 1;
                }
                Main.DFS(i, j);
            }
        }

        System.out.println(count);

    }

    public void DFS(int x, int y) {
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || nx >= n) continue;
            if (ny < 0 || ny >= n) continue;
            // 못가는 곳
            if (board[nx][ny] == 0) continue;

            board[nx][ny] = 0;
            DFS(nx, ny);
        }
    }
}
