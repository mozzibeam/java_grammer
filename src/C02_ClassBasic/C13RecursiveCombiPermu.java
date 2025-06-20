package C02_ClassBasic;

import java.util.ArrayList;
import java.util.List;

// 조합(combination) 과 순열(permutation)
public class C13RecursiveCombiPermu {

    static int staticCount = 0;

    public static void main(String[] args) {
        // 2중 for문 출력
//        int total = 0;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.println("hello world " + total);
//                total++;
//            }
//        }

        // 재귀 버전
//        forRecur(0, 2);

        // 조합 예시
        List<Integer> myList = List.of(1, 2, 3, 4);
        List<List<Integer>> doubleList = new ArrayList<>();
        boolean[] visited = new boolean[myList.size()];
//        combi(myList, new ArrayList<>(), doubleList, 0, 4);  // n개 조합
//        System.out.println(doubleList);

//        1,2,3,4를 n개씩 뽑은 순열 구하기
//        [[1,2],[1,3],[1,4],[2,1],[2,3]....[4,3]
        permu(myList, new ArrayList<>(), doubleList, visited,2);
    }

//    백트래킹, 재귀 암기 및 이해 후 문제풀이
//    백준 : 15649 - N과 M

//    백준 : 로또(6603)

    static void permu(List<Integer> myList, List<Integer> temp, List<List<Integer>> doubleList, boolean[] visited, int target) {
        if (temp.size() == target) {
            doubleList.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < myList.size(); i++) { //방문처리 필요
            if (!visited[i]) {
                visited[i] = true;
                temp.add(myList.get(i));
            }
            permu(myList, temp, doubleList,visited, target);
            temp.remove(temp.size() - 1);
            visited[i] = false;
        }
    }
    // 조합 재귀
    static void combi(List<Integer> myList, List<Integer> temp, List<List<Integer>> result, int start, int target) {
        if (temp.size() == target) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < myList.size(); i++) {
            temp.add(myList.get(i));
            combi(myList, temp, result, i + 1, target);
            temp.remove(temp.size() - 1);
        }
    }

    // 재귀 반복
    static void forRecur(int num, int target) {
        if (num == target) {
            System.out.println("hello world " + staticCount);
            staticCount++;
            return;
        }
        for (int i = 0; i < 3; i++) {
            forRecur(num + 1, target);
        }
    }
}
