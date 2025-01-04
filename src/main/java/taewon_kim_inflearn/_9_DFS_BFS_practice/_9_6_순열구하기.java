package taewon_kim_inflearn._9_DFS_BFS_practice;

import java.util.Scanner;
import java.util.Stack;

public class _9_6_순열구하기 {
    static int n, m;
    static int[] arr;

    public static void main(String[] args) {
        _9_6_순열구하기 Main = new _9_6_순열구하기();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        Stack<Integer> my = new Stack();
        int[] ch = new int[n];
        Main.DFS(0, my, ch);

    }

    public void DFS(int L, Stack<Integer> my, int[] ch) {
        if (L == m) {
            for (int i : my) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 1) continue;
                my.push(arr[i]);
                ch[i] = 1;
                DFS(L + 1, my, ch);
                my.pop();
                ch[i] = 0;
            }
        }
    }
}
