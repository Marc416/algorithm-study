package taewon_kim_inflearn._07_dfs_bfs_basic;

import java.util.ArrayList;
import java.util.List;

public class _7_4_피보나치_배열로만들기 {
    public static List<Integer> generateFibonacci(int n) {
        List<Integer> fibSequence = new ArrayList<>();

        if (n <= 0) return fibSequence; // 0개 요청 시 빈 리스트 반환
        if (n >= 1) fibSequence.add(1); // 첫 번째 항 추가
        if (n >= 2) fibSequence.add(1); // 두 번째 항 추가

        for (int i = 2; i < n; i++) { // 2번째 항부터 n-1번째 항까지 계산
            int nextValue = fibSequence.get(i - 1) + fibSequence.get(i - 2);
            fibSequence.add(nextValue);
        }

        return fibSequence;
    }

    public static void main(String[] args) {
        int n = 45; // 생성할 피보나치 수열의 항 개수
        List<Integer> result = generateFibonacci(n);

        System.out.println("Fibonacci sequence with " + n + " terms: " + result);
    }
}
