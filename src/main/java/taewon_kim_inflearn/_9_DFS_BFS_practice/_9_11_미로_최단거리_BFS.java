package taewon_kim_inflearn._9_DFS_BFS_practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _9_11_미로_최단거리_BFS {
    static int[][] board;
    static int[][] dis;
    static int[] dx = {0, 1, -1, 0};
    static int[] dy = {1, 0, 0, -1};

    public static void main(String[] args) {
        _9_11_미로_최단거리_BFS Main = new _9_11_미로_최단거리_BFS();
        Scanner kb = new Scanner(System.in);
        board = new int[8][8];
        dis = new int[8][8];
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                board[i][j] = kb.nextInt();
            }
        }
        board[1][1] = 1;

        System.out.println(Main.BFS(1, 1));
    }

    public int BFS(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            if (cur[0] == 7 && cur[1] == 7) {
                return dis[7][7];
            }

            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];
                if (nx < 1 || nx > 7) continue;
                if (ny < 1 || ny > 7) continue;
                if (board[nx][ny] > 0) continue;
                board[nx][ny] = 1;
                dis[nx][ny] = dis[cur[0]][cur[1]] + 1;
                q.offer(new int[]{nx, ny});
            }
        }
        return -1;
    }
}
