package taewon_kim_inflearn._9_DFS_BFS_practice;

import java.util.Scanner;

public class _9_1_합이같은_부분집합_DFS {
    static int n, total;
    static String answer = "NO";
    static Boolean flag = false;

    public static void main(String[] args) {
        _9_1_합이같은_부분집합_DFS Main = new _9_1_합이같은_부분집합_DFS();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();

        int[] arr = new int[n];
        for (int i = 1; i < n; i++) {
            arr[i] = kb.nextInt();
            total += arr[i];
        }
        Main.DFS(0, 0, arr);
        System.out.println(answer);
    }

    public void DFS(int L, int sum, int[] arr) {
        if (flag == true) return;
        if (sum > total / 2) return;
        if (L == n) {
            if (total - sum == sum) {
                answer = "YES";
                flag = true;
            }

        } else {
            DFS(L + 1, sum + arr[L], arr);
            DFS(L + 1, sum, arr);
        }
    }
}
