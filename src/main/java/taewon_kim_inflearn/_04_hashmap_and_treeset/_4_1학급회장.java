package taewon_kim_inflearn._04_hashmap_and_treeset;

import java.util.HashMap;
import java.util.Scanner;

public class _4_1학급회장 {

    public static String solution(int size1, String s){
        String[] array1 = s.split("");
        HashMap<String, Integer> map = new HashMap<>();

        int max = Integer.MIN_VALUE;
        String answer = "";
        for (int i = 0; i < size1; i++) {
            map.put(array1[i], map.getOrDefault(array1[i], 0) + 1);
            if(map.get(array1[i]) > max){
                max = map.get(array1[i]);
                answer = array1[i];
            }
        }
//        비교방법을 써도 되나 answer를 연산중에 결정하는게 좀더 효율적이다.
//
//        Optional<Map.Entry<String, Integer>> maxEntry = map.entrySet()
//            .stream()
//            .max(Map.Entry.comparingByValue());
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size1 = scanner.nextInt();
        String str = scanner.next();
        System.out.println(solution(size1, str));
    }
}
