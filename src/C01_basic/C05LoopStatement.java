package C01_basic;

import java.util.Arrays;
import java.util.Scanner;

public class C05LoopStatement {
    public static void main(String[] args) {
//        int a = 0;
//        while (a < 10) {
//            a++;
//            System.out.println("hello world");
//        }
//
//        int b = 2;
//        while (b < 11) {
//            System.out.println(b);
//            b++;
//        }


//        무한 반복되는 도어락키 예제
//        int count = 0;
//        while (true) {
//            int answer = 1234;
//            Scanner sc = new Scanner(System.in);
//            if (answer == sc.nextInt()) {
//                System.out.println("문이 열렸습니다.");
//                break : 가장 가까이 있는 반복문을 종료
//                break;
//            } else {
//                System.out.println("비밀번호가 틀렸습니다.");
//            }
//            count ++;
//            if (count == 5) {
//                System.out.println("5회 이상 초과했습니다!");
//                break;
//            }
//        }

//        입력한 숫자의 구구단 단수 출력
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.print("구구단 단수를 입력해주세요( 0 입력시 프로그램 종료 ) : ");
//            int input = sc.nextInt();
//            if (input == 0) {
//                System.out.println("프로그램을 종료합니다.");
//                break;
//            }
//            for (int i = 1; i < 10; i++) {
//                System.out.println(input + " * " + i + " = " + input*i);
//            }
//        }


//        do-while문 : 무조건 한번은 실행되는 while문 ( 실무에서 거의 안 쓰임 switch 보다도)
//        int a =100;
//        do {
//            System.out.println(a);
//        } while (a < 10);

//        for문 : 초기식, 조건식, 증감식이 모두 포함돼 있는 반복문
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }

//        1 ~ 10 중에 홀수만 출력하기
//        for (int i = 0; i < 11; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }


//        1 ~ 20 까지 짝수의 총합을 출력
//        int sum = 0; // for문 안으로 선언이 되면 계속 초기화됨
//        for (int i = 1; i <= 20; i++) {
//            if (i % 2 == 0) {
//                sum += i;
//                System.out.println(i);
//            }
//        }
//        System.out.println(sum);

//        두 수의 최대공약수 찾기
//        int a = 24;
//        int b = 36;
//
//        // 삼항연산자로도 min 값 구할 수 있음
//        int min = a>b?a:b;
//        int max = 0;
//
//        for (int i = 1; i <= min; i++) {
//            if (a % i == 0 && b % i == 0) {
//                max = i;
//            }
//        }
//        System.out.println(max);
//
//
//        for (int i = min; i >= 1; i--) { //초기값 min,  i >= 1, i--로 하는 방법도 가능
//            if (a % i == 0 && b % i == 0) {
//                System.out.println(i);
//                break;
//            }
//        }

//        소수구하기 : 1과 자신을 제외한 숫자를 나누어지지 않는 수
//        사용자가 입력한 값이 소수인지 아닌지 판별해주는 프로그램
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        boolean check = false;
//        for (int i = 2; i < input; i++) {
//            if (input % i == 0) {
//                check = true;
//                break;
//            }
//        }
//        if (check == false) { // == if(!check)
//            System.out.println("소수임");
//        } else {
//            System.out.println("소수아님");
//        }


//        소수판별 개선 로직 루트만큼 차이가남
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        boolean check = false;
//        for (int i = 2; i*i < input; i++) {
//            if (input % i == 0) {
//                check = true;
//                break;
//            }
//        }
//        if (check == false) { // == if(!check)
//            System.out.println("소수임");
//        } else {
//            System.out.println("소수아님");
//        }

//        continue : 반복문에 조건식으로 이동하는 명령어
//        홀수만 출력
//        for (int i = 0; i < 11; i++) {
//            if (i % 2 == 0) {
//               continue는 코드의 직관성과 가독성을 위해 사용
//                continue;
//            }
//            System.out.println(i);
//        }


//        향상된(enhanced) for문 : for-each
//        int[] intArr = {1, 3, 5, 7}; //선언과 동시에 초기화

//        잉반 for문 활용한 배열접근방식
//        for (int i = 0; i < intArr.length; i++) {
//            System.out.println(intArr[i]);
//        }

//        향상된 for문을 활용한 배열접근방식
//        System.out.println();
//        일종의 복사본을 만들어서 값을 꺼내옴
//        for (int i : intArr) {
//            System.out.println(i);
//        }

//        일반 for문을 토한 배열의 지정된 값 변경
        int[] intArr = {1, 3, 5, 7};
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] += 10;
        }
//        참조형변수(객체타입)는 기본적으로 변수를 통한 출력시에 메모리값이 출력.
        System.out.println(intArr);
//        힙메모리의 값을 가져옴 (원본의 값을 가져와서 잘 적용됨
        System.out.println(Arrays.toString(intArr));

//        향상된 for문을 통한 arr의 지정된 값 설정
//        원본의 값 변경 불가

//        자바 변수의 유효범위 : { }
//        int num = 10;
//        if (true) {
//            num = 20;
//            int num2 = 20;
//        }
//        num2 = 30; //if문 중괄호 내에서 정의된 변수는 해당 중괄호 밖에서는 사용불가


//        다중 반복문
//        2 ~ 9단 한꺼번에 출력 + 각 단마다 몇단입니다 출력

//        for (int i = 1; i <= 9; i++) {
//            System.out.println("==========" + i + "단입니다===========");
//            for (int j = 1; j <= 9; j++) {
//                System.out.println(i + " * " + j + " = " + i*j );
//            }
//        }


//        라벨문 : 반복문에 이름을 붙이는 것
//        loop1:
//        for (int i = 0; i < 10; i++) {
//            loop2:
//            for (int j = 0; j < 10; j++) {
//                break loop1; //원하는 for문을 라벨링을 통해 종료시킬 수 있음
//            }
//        }


//        2차원 배열 맛보기
//        int[][] arr2 = {
//                {1, 2, 3},
//                {4, 5, 11},
//                {7, 8, 9},
//                {10, 11, 12}
//        };
//
//        loop1:
//        for(int i=0; i<arr2.length; i++){
//            for(int j=0; j<arr2[i].length; j++){
//                if(arr2[i][j] == 11){
//                    System.out.println(i+" " + j);
//                    break loop1;
//                }
//            }
//        }

//        라벨링 활용 문제풀이
//        100 ~ 200까지 수 중에서 가장 작은 소수 출력
//        boolean isDiv = false;
//        int min = 0;
//        for (int i = 100; i <= 200; i++) {
//            for (int j = 2; j * j <= i; j++) {
//                if (i % j == 0) {
//                    isDiv = false;
//                    break;
//                } else {
//                    min = i;
//                    isDiv = true;
//                }
//            }
//            if (isDiv) {
//                System.out.println(min + "소수");
//                break;
//            }


            //        100~200까지 수 중에서 가장 작은 소수를 출력하라
//            loop1:
//            for (int i = 100; i <= 200; i++) {
//                loop2:
//                for (int j = 2; j*j <= i; j++) {
//                    if (i%j==0){
//                        continue loop1; // 소수가 아님. 다음 i로 넘어감.
//                    }
//                }
//                // 여기까지 왔다는 건 소수라는 뜻
//                System.out.println(i);
//                break; // 가장 처음 나온 소수니까 출력하고 종료
            }

        }
