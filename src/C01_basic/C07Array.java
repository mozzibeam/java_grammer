package C01_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;

public class C07Array {
    public static void main(String[] args) throws IOException {
        //    배열표현식1. 배열 선언 후 할당 방식
//        int[] arr1 = new int[5];
//        arr1[0] = 10;
//        arr1[1] = 20;
//        arr1[3] = 40;
//        arr1[4] = 50;
//        arr1[5] = 10; //IndexOutOfBounds 예외 발생 - 배열 길이가 동적으로 늘어날 수 없음
//
//        System.out.println(arr1[2]); //int배열의 경우 0으로 초기화

//        배열표현식2. 리터럴방식
//        int[] arr2 = {10,20,30,40,50};

//        배열표현식3. 오른쪽만 봐도 int배열임을 알 수 있음
//        int[] arr3 = new int[]{10, 20, 30, 40, 50};
//        예시)
//        ArrayList<int[]> list = new ArrayList<>();
//        list.add(new int[]{5,6,7,8,9});
//        list.add(new int[]{1,2,3});
//
//        System.out.println(list.get(1)[0]);

//        배열표현식4 : 불가 -> 배열의 길이를 반드시 확정시켜야함
//        int[] arr4 = new int[];

//        Arrays.fill : 배열에 모든 값을 변경
//        String[] arr = new String[5];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = "";
//        }
//        Arrays.fill(arr, ""); //Arrays는 클래스 명령어 static 붙음

//        85, 65, 90으로 구성된 int 배열을 선언하고, 총합과 평균을 구해보시오.
//        int[] intArr = new int[]{85, 65, 90};
//        int sum = 0;
//        for (int i : intArr) {
//            sum += i;
//        }
//        System.out.println(sum);
//        System.out.println((double) sum/intArr.length);

//        배열의 최대값 최소값
//        int[] intArr = new int[]{87, 45, 23, 55, 67, 12, 44, 32, 97, 67};
//
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//
//        for (int i : intArr) {
//            if (i > max) max = i;
//            if (i < min) min = i;
//        }
//        System.out.println("최대값은 : " + max);
//        System.out.println("최소값은 : " + min);
//        System.out.println(Arrays.stream(intArr).max());

//        배열의 자리 바꾸기
//        int[] arr = {20, 10, 30};
//        int temp;
//        temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;
//        System.out.println(Arrays.toString(arr));

//        배열뒤집기
//        int[] arr = {10, 20, 30, 40, 50};
//        int[] newArr = new int[arr.length];
//        String s = "";
//        for (int i = arr.length; i >= 0; i--) {
//            s += Integer.toString(i).split(" ");
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//
//        }

//        배열의 정렬
//        int[] arr = {17, 12, 20, 15, 10};
//        Integer[] newArr = new Integer[arr.length]; -> int[] answer = new int[newArr.length];
//        Arrays.sort(arr);  // rrays.sort(arr, Comparator.reverseOrder()); //원시자료형은 Comparator 사용불가
//        System.out.println(Arrays.toString(arr)); //오름차순
//        String[] strArr = {"abc", "bcd", "fed", "dbd", "agh"};
//        Arrays.sort(strArr, Comparator.reverseOrder()); //내림차순
//        System.out.println(Arrays.toString(strArr));


//        선택정렬 알고리즘 직접구현
//        min값 찾기, 자리 바꾸기, 2중 for문(index주의를 곁들인)
//        int[] arr = {17, 12, 20, 10, 15};
//        int min = 0;
//
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    min = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = min;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//
//        for (int i = 0; i < arr.length; i++) {
//            int min2 = arr[i];
//            int minIndex = i;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] < min2) {
//                    min2 = arr[j];
//                    minIndex = j;
//                }
//            }
////            자리체인지 로직
//            int temp = arr[i];
//            arr[i] = arr[minIndex];
//            arr[minIndex] = temp;
//        }
//        System.out.println(Arrays.toString(arr));

//        조합문제 : 모두 각기 다른 숫자의 배열이 있을 때, 만들어질 수 있는 두 숫자의 조합을 문자열 형태로 출력
//        ex(10,20) (10,30) (10, 40) (10, 50) (10, 60)

//        int[] intArr = {10, 20, 30, 40, 50, 60};
//        int temp = 0;
//
//        for (int i = 0; i < intArr.length; i++) {
//
//            if (i == 0) {
//                for (int j = i + 1; j < intArr.length; j++) {
//
//                }
//            } else {
//                for (int j = i-1; j < intArr.length && i != j ; j++) {
//
//                }
//            }
//
//        }


//        배열의 중복제거 : set자료구조를 활용하여 중복을 제거 (set특징 : 중복x, 순서x)
//        int[] arr = {10, 10, 20, 30, 40, 50};
//        Set<Integer> Myset = new HashSet<>();
//        for (int i : arr) {
//            Myset.add(i);
//        }
//        System.out.println(Myset);
//        int[] answer = new int[Myset.size()];
//        int index = 0;
//        for (int i : Myset) {
//            answer[index] = i;
//            index++;
//        }
//        Arrays.sort(answer);
//        System.out.println(Arrays.toString(answer));

//        배열의 검색
//        int[] arr = {5, 3, 1, 8, 7};
//        int target = 8;
//        8이 몇번째 index인지 출력
//        for (int i = 0; i < arr.length; i++) {
//            if (target == arr[i]) {
//                System.out.println(target + "은 " + i + "번째 index에 있습니다");

//        이분탐색(이진검색) - binary search
//        사전에 데이터가 오름차순,정렬된 상태의 경우, 이분탐색 가능
//        int[] arr = {1, 3, 6, 8, 9, 11, 15};
//        값이 존재하면 해당 index 리턴
//        값이 없으면 마이너스 값
//        System.out.println(Arrays.binarySearch(arr, 15));


//        백준  1920
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        String[] s1 = br.readLine().split(" ");
//        int m = Integer.parseInt(br.readLine());
//        String[] s2 = br.readLine().split(" ");
//
//        int[] i1 = new int[s1.length];
//
//        int index = 0;
//        for (String s : s1) {
//            i1[index] = Integer.parseInt(s);
//        }
//        Arrays.sort(i1);

//        배열값 비교
//        int[] arr1 = {10, 20, 30};
//        int[] arr2 = {10, 20, 30};
//        System.out.println(arr1 == arr2);
//        System.out.println(Arrays.equals(arr1, arr2));
//
////        2차원 배열의 선언과 값 할당
//        int[][] arr = new int[3][2]; // {{0,0},{0,0},{0,0}}
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[1][0] = 3;
//        arr[1][1] = 4;
//        arr[2][0] = 5;
//        arr[3][1] = 6;






//        리터럴 방식
//        int[][] arr3 = {{1, 2}, {3, 4}, {5, 6}};
//        2차원 배열의 출력
//        System.out.println(arr3); //2차원 배열의 주소값
//        System.out.println(Arrays.toString(arr3)); //각1차원 배열의 주소값 모음
//        System.out.println(Arrays.deepToString(arr3)); //각1차원배열의 값을 출력
//        가변배열 : 배열의 전체길이는 반드시 할당
//        int[][] arr4 = new int[3][];
//        arr4[0] = new int[2];
//        arr4[0][0] = 1;
//        arr4[0][1] = 2;
//        arr4[1] = new int[3];
//        arr4[2] = new int[5];

//        [3][4] 사이즈 배열을 선언하고 1~12까지 숫자값을 각 배열에 순차적으로 할당
//        {1,2,3,4}, {5,6,7,8}, {1,2,3,4}
//        int[][] myArr = new int[3][4];
//        int num = 1;
//        for (int i = 0; i < myArr.length; i++) {
//            for (int j = 0; j < myArr[i].length; j++) {
//                myArr[i][j] = num;
//                num++;
//            }
//        }
//        System.out.println(Arrays.deepToString(myArr));

//        가변배열 값 채우기
//        int[][] myArr = new int[3][];
//        int num = 1;
//        for (int i = 0; i < myArr.length; i++) {
//            myArr[i] = new int[4];
//            for (int j = 0; j < myArr[i].length; j++) {
//                myArr[i][j] = num;
//                num++;
//            }
//        }
//        System.out.println(Arrays.deepToString(myArr));

//        행렬의 덧셈 - 프로그래머스
//        int[][] arr1 = {{1, 2}, {2, 3}};
//        int[][] arr2 = {{3, 4}, {5, 6}};
//
//        int[][] answer = new int[arr1.length][arr1[0].length];
//
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1.length; j++) {
//                answer[i][j] = arr1[i][j] +  arr2[i][j];
//            }
//        }
//        System.out.println(Arrays.deepToString(answer));

//        k번째수
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int i = 2; int j = 5; int k = 1;
        int[] sliced = Arrays.copyOfRange(array, i-1, j);
        Arrays.sort(sliced);
        System.out.println(Arrays.toString(sliced));
        System.out.println(sliced[k-1]);

//         배열복사
//        Arrays.copyOf(배열명 , length), Arrays.copyOfRange(배열명, start, end)








    }

}
