package taewon_kim_inflearn._9_DFS_BFS_practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class _9_12_토마토익기_BFS_dis {
    static int n, m;
    static int[][] board, dis;
    static int dx[] = {1, 0, 0, -1};
    static int dy[] = {0, 1, -1, 0};
    static Queue<Point> q = new LinkedList<>();


    public static void main(String[] args) {
        _9_12_토마토익기_BFS_dis Main = new _9_12_토마토익기_BFS_dis();
        Scanner kb = new Scanner(System.in);
        m = kb.nextInt();
        n = kb.nextInt();
        board = new int[n][m];
        dis = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = kb.nextInt();
                if (board[i][j] == 1) q.offer(new Point(i, j));
            }
        }

        Main.BFS();
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                answer = Integer.max(answer, dis[i][j]);
            }
        }
        System.out.println(answer);
    }

    public void BFS() {
        while (!q.isEmpty()) {
            Point tmp = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];

                if (nx < 0 || nx >= n) continue;
                if (ny < 0 || ny >= m) continue;
                if (board[nx][ny] > 0) continue;
                if (board[nx][ny] == -1) continue;
                dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                board[nx][ny] = 1;
                q.offer(new Point(nx, ny));
            }
        }
    }
}
