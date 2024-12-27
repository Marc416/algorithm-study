package taewon_kim_inflearn._03_two_pointer_and_sliding_window;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _3_1두배열합치기_다이나믹활용 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 입력: 배열 크기 1
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        // 두 번째 입력: 배열 크기 2
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }
        // 동적으로 데이터를 저장하기 위한 리스트
        List<Integer> result = new ArrayList<>();

        // 두 배열의 값을 합치기
        for (int num : array1) {
            result.add(num);
        }
        for (int num : array2) {
            result.add(num);
        }

        // 정렬
        Collections.sort(result);

        // 결과 출력
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
