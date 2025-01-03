package taewon_kim_inflearn._08_DFS_BFS_basic;


public class _8_2_최단거리_말단노드_DFS {
    Node root;

    public int DFS(int L, Node node) {
        if (node.lt == null && node.rt == null) return L;
        else return Math.min(DFS(L + 1, node.lt), DFS(L + 1, node.rt));
    }

    public static void main(String[] args) {
        _8_2_최단거리_말단노드_DFS T = new _8_2_최단거리_말단노드_DFS();
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);
        System.out.println(T.DFS(0, T.root));
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

