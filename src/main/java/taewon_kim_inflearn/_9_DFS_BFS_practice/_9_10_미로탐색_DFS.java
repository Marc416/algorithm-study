package taewon_kim_inflearn._9_DFS_BFS_practice;

import java.util.Scanner;

public class _9_10_미로탐색_DFS {
    static int[][] board;
    static int[] dx = {0, 1, -1, 0};
    static int[] dy = {1, 0, 0, -1};
    static int answerCount = 0;

    public static void main(String[] args) {
        _9_10_미로탐색_DFS Main = new _9_10_미로탐색_DFS();
        Scanner kb = new Scanner(System.in);
        board = new int[8][8];
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                board[i][j] = kb.nextInt();
            }
        }
        board[1][1] = 1;
        Main.DFS(1, 1);
        System.out.println(answerCount);
    }

    public void DFS(int curX, int curY) {
        if (curX == 7 && curY == 7) {
            ++answerCount;
        } else {
            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];
                if (nx < 1 || nx > 7) continue;
                if (ny < 1 || ny > 7) continue;
                if (board[nx][ny] > 0) continue;
                board[nx][ny] = 1;
                DFS(nx, ny);
                board[nx][ny] = 0;
            }
        }
    }
}
