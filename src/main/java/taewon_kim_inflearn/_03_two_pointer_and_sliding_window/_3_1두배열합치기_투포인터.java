package taewon_kim_inflearn._03_two_pointer_and_sliding_window;

import java.util.ArrayList;
import java.util.Scanner;

public class _3_1두배열합치기_투포인터 {

    public static ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        int p1 = 0, p2 = 0;
        ArrayList<Integer> answer = new ArrayList<>();

        while(p1 < n && p2 <m){
            if(a[p1] < b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        }
        while(p1 <n) answer.add(a[p1++]);
        while(p2 <m) answer.add(b[p2++]);

        answer.stream().forEach(s -> System.out.print(s + " "));
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int [] b = new int[m];
        for(int i = 0; i < m; i++) {
            b[i] = kb.nextInt();
        }
        solution(n, m, a, b);
    }
}
