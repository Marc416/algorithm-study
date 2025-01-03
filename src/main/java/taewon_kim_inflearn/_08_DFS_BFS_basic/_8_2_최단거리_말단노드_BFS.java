package taewon_kim_inflearn._08_DFS_BFS_basic;

import java.util.LinkedList;
import java.util.Queue;

class _8_2_최단거리_말단노드_BFS {
    public int BFS(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int L = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                Node cur = q.poll();
                if (cur.lt == null && cur.rt == null) return L;
                if(cur.rt != null) q.offer(cur.rt);
                if(cur.lt != null) q.offer(cur.lt);
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        _8_2_최단거리_말단노드_BFS T = new _8_2_최단거리_말단노드_BFS();
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        System.out.println(T.BFS(root));

    }

    static class Node {
        int data;
        Node lt;
        Node rt;

        public Node(int data) {
            this.data = data;
            this.lt = null;
            this.rt = null;
        }
    }
}
