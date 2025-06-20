package C02_ClassBasic;

import java.util.ArrayList;
import java.util.List;

public class C11RecursiveBasic {
    public static void main(String[] args) {
        recur2(new ArrayList<>(), 0, 3);
    }

    public static void recur0(int count, int limit) {
        if (count == limit) {
            return;
        }
        System.out.println(" 재귀 호출 전 count: " + count); // 1번째: 1, 2번쨰: 2, 3번쨰: 3
        recur0(count + 1, limit);
        System.out.println(" 재귀 호출 후 count: " + count); // 1번째: 0, 2번쨰: 1, 3번쨰: 2

    }
//    아래함수 출력순서 : 전 c0 -> 전 c1 -> 전 c2 -> 후 c3 -> 후 c2 -> 후 c1
    public static void recur1(int count, int limit) {
        if (count == limit) {
            return;
        }
        System.out.println(" 재귀 호출 전 count: " + count);
        count = count + 1;
        recur1(count, limit);
        System.out.println(" 재귀 호출 후 count: " + count);
    }


//      객체를 매개변수로 활용한 재귀함수 : 객체는 힙메모리를 통해 원본객체 변경될 수 있으므로, 재귀함수 전에 값이 일치되는 현상
    public static void recur2(List<Integer> myList, int num, int target) {
        if (myList.size() == target) {
            return;
        }
        myList.add(num);
        recur2(myList, num + 1, target);
        System.out.println(myList);
    }

}
