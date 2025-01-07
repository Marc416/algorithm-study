package taewon_kim_inflearn._9_DFS_BFS_practice;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _9_12_토마토익기_BFS_Timelimit {
    static int m, n;
    static int[][] graph;
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, 1, -1, 0};
    static int wallCount = 0;
    static int expectedAnswer;
    static int vapedFruitCount = 0;

    public static class Position {
        int x;
        int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        _9_12_토마토익기_BFS_Timelimit Main = new _9_12_토마토익기_BFS_Timelimit();
        Scanner kb = new Scanner(System.in);
        m = kb.nextInt();
        n = kb.nextInt();
        graph = new int[n][m];
        Queue<Position> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int value = kb.nextInt();
                graph[i][j] = value;
                if (value == 1) {
                    q.offer(new Position(i, j));
                    ++vapedFruitCount;
                }
                if (value == -1) wallCount++;
            }
        }
        expectedAnswer = n * m - wallCount;

        System.out.println(Main.BFS(0, q));
    }

    public int BFS(int L, Queue<Position> q) {
        while (!q.isEmpty()) {
            if (expectedAnswer == vapedFruitCount) return L;
            List<Position> allElements = q.stream().collect(Collectors.toList());
            q.clear();
            for (Position cur : allElements) {

                for (int i = 0; i < 4; i++) {
                    int nx = cur.x + dx[i];
                    int ny = cur.y + dy[i];
                    if (nx >= n || nx < 0) continue;
                    if (ny >= m || ny < 0) continue;
                    if (graph[nx][ny] == -1) continue;
                    if (graph[nx][ny] == 1) continue;

                    graph[nx][ny] = 1;
                    ++vapedFruitCount;
                    q.offer(new Position(nx, ny));
                }
            }
            L++;
        }
        return -1;
    }
}
