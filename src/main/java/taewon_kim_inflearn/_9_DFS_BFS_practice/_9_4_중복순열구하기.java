package taewon_kim_inflearn._9_DFS_BFS_practice;

import java.util.Scanner;
import java.util.Stack;

public class _9_4_중복순열구하기 {
    static int n, m;

    public static void main(String[] args) {
        _9_4_중복순열구하기 Main = new _9_4_중복순열구하기();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        Stack<Integer> stack = new Stack<>();
        Main.DFS(0, stack);
    }

    public void DFS(int L, Stack<Integer> stack) {
        if (L == m) {
            for(int i : stack){
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i < n + 1; i++) {
                stack.push(i);
                DFS(L + 1, stack);
                stack.pop();
            }
        }
    }
}