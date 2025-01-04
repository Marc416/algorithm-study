package taewon_kim_inflearn._08_DFS_BFS_basic;

import java.util.*;

public class _8_14_각노드최단거리_인접리스트로 {
    static int n, m = 0;
    static List<List<Integer>> graph;
    static int[] ch, dis;

    public static void main(String[] args) {
        _8_14_각노드최단거리_인접리스트로 Main = new _8_14_각노드최단거리_인접리스트로();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<>();
        ch = new int[n + 1];
        dis = new int[n + 1];

        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }

        Main.BFS(1);
        for (int i = 2; i < n + 1; i++) {
            System.out.print(i + " : ");
            System.out.println(dis[i]);
        }

    }

    public void BFS(int v) {
        ch[v] = 1;
        dis[v] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        while (!q.isEmpty()) {
            int cv = q.poll();
            for (int nv : graph.get(cv)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    q.offer(nv);
                    dis[nv] = dis[cv] + 1;
                }
            }
        }
    }
}

/**
6 9
1 3
1 4
2 1
2 5
3 4
4 5
4 6
6 2
6 5
 */