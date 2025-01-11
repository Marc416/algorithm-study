package taewon_kim_inflearn._9_DFS_BFS_practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Position {
    int x;
    int y;
    int groupNumber;

    Position(
        int x,
        int y
    ) {
        this.x = x;
        this.y = y;
    }
}

public class _9_13_섬나라아일랜드_BFS {
    static int n;
    static int[][] board;
    static int[] dx = {0, 1, -1, 0, 1, -1, 1, -1};
    static int[] dy = {1, 0, 0, -1, 1, -1, -1, 1};
    static int answer = 0;
    static Queue<Position> q = new LinkedList<>();

    public static void main(String[] args) {
        _9_13_섬나라아일랜드_BFS Main = new _9_13_섬나라아일랜드_BFS();
        Scanner kb = new Scanner(System.in);
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
                ++answer;
                board[i][j] = 0;
                Main.BFS(i, j);
            }
        }

        System.out.println(answer);
    }

    public void BFS(int x, int y) {
        q.offer(new Position(x, y));
        while (!q.isEmpty()) {
            Position curPos = q.poll();
            for (int i = 0; i < 8; i++) {
                int nx = curPos.x + dx[i];
                int ny = curPos.y + dy[i];
                if (nx < 0 || nx >= n) continue;
                if (ny < 0 || ny >= n) continue;
                if (board[nx][ny] == 0) continue;
                board[nx][ny] = 0;
                q.offer(new Position(nx, ny));
            }
        }
    }
}
