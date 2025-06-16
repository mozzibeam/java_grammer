package C01_basic;

import java.sql.Array;
import java.util.*;

public class C08List {
    public static void main(String[] args) {
//        List 선언방법
//        ArrayList<String> myList1 = new ArrayList<>();
//        ArrayList<String> myList2 = new ArrayList<>();

//        List 선언방법2 : 가장 일반적인 방법
//        List<String> myList3 = new ArrayList<>();

//        초기값 세팅방법1 : 개별data add
//        myList3.add("java");
//        myList3.add("python");
//        myList3.add("C++");
//
//        System.out.println(myList3);

//        초기값 세팅방법2 : 배열을 리스트로 변환
//        String[] arr = {"java", "python", "C++"};
//        List<String> myList4 = new ArrayList<>(Arrays.asList(arr));
//
//        int[] intArr = {10, 20, 30};
//        List<Integer> myIntList = new ArrayList<>();
//        for (int a : intArr) {
//            myIntList.add(a); //int를 Integer로 자동형변환
//        }

//        add메서드 : 리스트에 값을 하나씩 추가하는 메서드
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(0, 30); //List는 중간 데이터 삽입/삭제 성능 비효율적
//        System.out.println(myList);

//        get(index) : 특정 index의 요소 반환
//        System.out.println(myList.get(0));

//        size() : 리스트의 개수(길수)를 반환
//        System.out.println(myList.size());

//        for문을 활용해서 myList값 하나씩 모두 출력
//        for (int i = 0; i < myList.size(); i++) {
//            System.out.println(myList.get(i));
//        }
//
//        for (Integer i : myList) {
//            System.out.println(i);
//        }

//        remove : 요소삭제
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//        1) index를 통한 삭제 2) value를 통한 삭제(일반적이지 않음)
//        for (int i = 0; i < myList.size(); i++) { // size() 동적으로 크기가 바뀔 수 있음 변수에 담아두고 사용 추천
//            myList.remove(0);
//        }
//        myList.remove(Integer.valueOf(30));
//        System.out.println(myList);

//        clear : 요소 전체 삭제
//        myList.clear();
//        System.out.println(myList.isEmpty());

//        indexOf : 특정값을 찾아 index return (중복시 가장 먼저 나오는값 리턴)
//        List<Integer> myList2 = new ArrayList<>();
//        myList2.add(10);
//        myList2.add(20);
//        myList2.add(30);
//        myList2.add(30);
//        System.out.println(myList2.indexOf(30));

//        contains : 값의 유무 여부를 리턴
//        System.out.println(myList2.contains(20));

//        n의 배수 고르기
//        int n = 3;
//        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
//        List<Integer> list = new ArrayList<>();
//        for (int i : numlist) {
//            if (i % n == 0) {
//                list.add(i);
//            }
//        }
//        System.out.println(list);
//        int[] answer = new int[list.size()];

//        정렬 : 방법2가지 (Collections클래스 사용, 객체사용)
//        List<Integer> myList = new ArrayList<>();
//        myList.add(5);
//        myList.add(3);
//        myList.add(2);
//        myList.add(1);
//        myList.add(4);
//        Collections.sort(myList, Comparator.reverseOrder());
//        System.out.println(myList);

//        객체(ArrayList클래스).sort
//        myList.sort(Comparator.naturalOrder());
//        myList.sort(Comparator.reverseOrder());

//        이중리스트 : 리스트
//        [[1, 2],[3, 4],[5, 6]]
//        List<List<Integer>> myList = new ArrayList<>();
//        List<Integer> myList1 = new ArrayList<>();
//        myList.add(myList1);
//        myList.add(new ArrayList<>());
//        myList.get(0).add(1);
//        myList.get(0).add(2); // [[1,2], []]
//        myList.get(1).add(3);
//        myList.get(1).add(4); // [[1,2], [3,4]]

//        for문 이용해서 [[1,2,3],[4,5,6],[7,8,9],[10,11,12]]
//        List<List<Integer>> lists = new ArrayList<>();
//        int num = 1;
//        for (int i = 0; i < 4; i++) {
//            lists.add(new ArrayList<>());
//            for (int j = 0; j < 3; j++) {
//                lists.get(i).add(num);
//                num++;
//            }
//        }
//        System.out.println(lists);

//        리스트안에 배열
//        [{1, 2}, {1, 2, 3}, {1, 2, 3, 4}]
        List<int[]> intlist = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int[] arr = new int[i+2];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = j + 1;
            }
            intlist.add(arr);
        }
        for (int[] ints : intlist) {
            System.out.print(Arrays.toString(ints));
        }


    }
}
