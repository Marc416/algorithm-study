package taewon_kim_inflearn._9_DFS_BFS_practice;

import java.util.*;
import java.util.stream.Collectors;

public class _9_9_조합구하기 {
    static int n, m;
    static int[] ch;
    static Set<List<Integer>> answer;

    public static void main(String[] args) {
        _9_9_조합구하기 Main = new _9_9_조합구하기();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        ch = new int[n + 1];
        answer = new HashSet<>();
        Main.DFS(0);
        answer.stream()
            .sorted(Comparator.comparing(list -> list.toString())) // 리스트를 정렬된 형태로 출력
            .forEach(list -> System.out.println(list.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" "))));


        System.out.println();
    }

    public void DFS(int L) {
        if (L == m) {
            List set = new ArrayList<>();
            for (int i = 1; i < n + 1; i++) {
                if (ch[i] == 1) {
                    set.add(i);
                }
            }
            answer.add(set);
        } else {
            for (int i = 1; i < n + 1; i++) {
                if (ch[i] > 0) continue;
                ch[i] = 1;
                DFS(L + 1);
                ch[i] = 0;
            }
        }
    }
}
